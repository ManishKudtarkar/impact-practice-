public class CirclePattern {
    public static void main(String[] args) {
        int radius = 8; // Change this value to adjust the size
        double dist;

        // Iterate through the grid from -radius to +radius for both axes
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                // Calculate distance from center (radius, radius)
                dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                // Hollow Circle Condition: check if distance is near the radius
                // Use (dist > radius - 0.5 && dist < radius + 0.5) for a thin border
                if (dist > radius - 0.5 && dist < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
