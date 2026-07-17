class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i <= m-1; i++){
            for(int j = 0; j <= n-1; j++){
                if(matrix[i][j] == 0){ 
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
         for(int i = 0; i <= m-1; i++){
            for(int j = 0; j <= n-1; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
         }
        
    }
}