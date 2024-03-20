class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // Initialize count of islands

        // Iterate through each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') { // If the current cell is land
                    bfs(grid, i, j); // Explore the island starting from this cell using BFS
                    count++; // Increment count since we found a new island
                }
            }
        }

        return count; // Return the total count of islands
    }

    // BFS method to explore the island starting from the given cell (i, j)
    public void bfs(char[][] grid, int i, int j) {
        int rows = grid.length; // Number of rows in the grid
        int cols = grid[0].length; // Number of columns in the grid

        // Base case: If the current cell is out of bounds or water ('0'), return
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // Mark the current cell as visited by changing it to water ('0')

        // Explore the neighboring cells in four directions: up, down, left, right
        bfs(grid, i + 1, j); // Down
        bfs(grid, i - 1, j); // Up
        bfs(grid, i, j + 1); // Right
        bfs(grid, i, j - 1); // Left
    }
}









//  it's not a bfs method i just named as a bfs 
 
  
   