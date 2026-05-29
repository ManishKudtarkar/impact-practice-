const express = require('express');
const cors = require('cors');
const fs = require('fs');
const path = require('path');

const app = express();
app.use(cors());

const practiceDir = path.join(__dirname, '../practice');

// Get all practice files
app.get('/api/files', (req, res) => {
  try {
    const files = fs.readdirSync(practiceDir);
    // Filter only files (not directories like java/)
    const fileStats = files.map(file => {
      const filePath = path.join(practiceDir, file);
      const stats = fs.statSync(filePath);
      return { file, isDirectory: stats.isDirectory() };
    }).filter(f => !f.isDirectory && f.file !== 'README.md');
    
    res.json(fileStats.map(f => f.file));
  } catch (err) {
    res.status(500).json({ error: 'Failed to read practice directory' });
  }
});

// Get content of a specific file
app.get('/api/files/:filename', (req, res) => {
  const filename = req.params.filename;
  const filePath = path.join(practiceDir, filename);
  
  // Basic security check to prevent directory traversal
  if (!filePath.startsWith(practiceDir)) {
    return res.status(403).json({ error: 'Access denied' });
  }

  try {
    if (fs.existsSync(filePath)) {
      const content = fs.readFileSync(filePath, 'utf8');
      res.send(content);
    } else {
      res.status(404).json({ error: 'File not found' });
    }
  } catch (err) {
    res.status(500).json({ error: 'Failed to read file' });
  }
});

const PORT = 3001;
app.listen(PORT, () => {
  console.log(`Backend API running on http://localhost:${PORT}`);
});
