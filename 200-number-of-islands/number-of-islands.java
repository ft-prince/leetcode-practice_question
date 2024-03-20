class Solution {
  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
        return 0;
    }

    int rows = grid.length;
    int cols = grid[0].length;
    int count = 0;

    HashSet<Integer> visited = new HashSet<>();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            int index = i * cols + j;
            if (grid[i][j] == '1' && !visited.contains(index)) {
                DFT(grid, i, j, visited);
                count++;
            }
        }
    }

    return count;
}

private void DFT(char[][] grid, int row, int col, HashSet<Integer> visited) {
    int rows = grid.length;
    int cols = grid[0].length;

    Stack<Integer> stack = new Stack<>();
    stack.push(row * cols + col);

    while (!stack.isEmpty()) {
        int currentIndex = stack.pop();
        int currentRow = currentIndex / cols;
        int currentCol = currentIndex % cols;

        if (!visited.contains(currentIndex) && grid[currentRow][currentCol] == '1') {
            visited.add(currentIndex);

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] dir : directions) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
                    stack.push(newRow * cols + newCol);
                }
            }
        }
    }
}

}