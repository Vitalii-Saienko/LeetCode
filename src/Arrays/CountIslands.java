package Arrays;
//TODO: https://leetcode.com/problems/number-of-islands/description/
public class CountIslands {

    public static int numIslands(char[][] grid) {
        int islandCounter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islandCounter++;
                    checkNeighbors(grid, i, j);
                }
            }
        }
        return islandCounter;
    }

    private static void checkNeighbors(char[][]map, int i, int j){
        if (i < 0 || i >= map.length || j < 0 || j >= map[i].length || map[i][j]=='0'){
            return;
        }
        map[i][j] = '0';
        checkNeighbors(map, i-1, j);
        checkNeighbors(map, i+1, j);
        checkNeighbors(map, i, j-1);
        checkNeighbors(map, i, j+1);
    }
}

