import { useState, useEffect } from 'react';
import axios from 'axios';
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { atomDark } from 'react-syntax-highlighter/dist/esm/styles/prism';
import './App.css';

function App() {
  const [files, setFiles] = useState([]);
  const [selectedFile, setSelectedFile] = useState(null);
  const [fileContent, setFileContent] = useState('');
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    fetchFiles();
  }, []);

  const fetchFiles = () => {
    axios.get('http://localhost:3001/api/files')
      .then(res => setFiles(res.data))
      .catch(err => console.error('Error fetching files:', err));
  };

  const handleSelectFile = (file) => {
    setSelectedFile(file);
    setLoading(true);
    axios.get('http://localhost:3001/api/files/' + file)
      .then(res => {
        setFileContent(res.data);
        setLoading(false);
      })
      .catch(err => {
        console.error('Error fetching file content:', err);
        setFileContent('Error loading file content.');
        setLoading(false);
      });
  };

  return (
    <div className="app-container">
      <header className="header">
        <h1>Coding Practice Showcase</h1>
        <p>A collection of my programming practice files.</p>
      </header>
      
      <div className="main-content">
        <aside className="sidebar">
          <h3>Practice Files ({files.length})</h3>
          <ul className="file-list">
            {files.map(file => (
              <li 
                key={file} 
                className={selectedFile === file ? 'active' : ''}
                onClick={() => handleSelectFile(file)}
              >
                {file}
              </li>
            ))}
          </ul>
        </aside>
        
        <main className="code-viewer">
          {selectedFile ? (
            <>
              <h2>{selectedFile}</h2>
              {loading ? (
                <div className="loading">Loading...</div>
              ) : (
                <div className="code-container">
                  <SyntaxHighlighter 
                    language={selectedFile.endsWith('.py') ? 'python' : 'java'} 
                    style={atomDark}
                    showLineNumbers
                  >
                    {fileContent}
                  </SyntaxHighlighter>
                </div>
              )}
            </>
          ) : (
            <div className="welcome-message">
              <h2>Welcome!</h2>
              <p>Select a file from the sidebar to view its source code.</p>
            </div>
          )}
        </main>
      </div>
    </div>
  );
}

export default App;
