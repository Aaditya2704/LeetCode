class Solution {
    public void setZeroes(int[][] matrix) {
         boolean isRow0Zero = false, isCol0Zero =false;
        int m = matrix.length;
        int n = matrix[0].length;

        // check if first column need to set zero
        for(int i =0; i< m; i++) {
            if(matrix[i][0] == 0) {
                isCol0Zero = true;
                break;
            }
        }

      // check if first row need to set zero
        for(int i =0; i< n; i++) {
            if(matrix[0][i] == 0) {
                isRow0Zero = true;
                break;
            }
        }


       for(int i=1; i<m; i++) {
           for(int j=1;j<n;j++) {
               if(matrix[i][j] == 0) {
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
           }
       }


        for(int i=1; i<m; i++) {
            for(int j=1;j<n;j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                  matrix[i][j] = 0;
                }
           }
        }

        if(isRow0Zero) {
            for(int i=0;i <n; i++) 
                 matrix[0][i] = 0;
        }

        if(isCol0Zero) {
            for(int i=0;i <m; i++) 
                 matrix[i][0] = 0;
        }
        
    
    }
}