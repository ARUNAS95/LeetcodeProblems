class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] r = new int [2];
        int n = grid.length;
        int n1 = n*n;
        int [] result = new int [n*n];
        int k=0;
        int sum1 = 0;  
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[k] = grid[i][j];
                sum1 = sum1+ result[k];
               k++;
            }
        }
        Arrays.sort(result);  
        
            
        for(int i =0;i<n*n-1;i++){
            if(result[i] == result[i+1]){
                r[0] = result[i];
                sum1 = sum1 - result[i+1];
            }
            
        }
        
        int sum = (n1*(n1+1))/2;

        r[1] = sum -sum1;


        return r ;
    }
}