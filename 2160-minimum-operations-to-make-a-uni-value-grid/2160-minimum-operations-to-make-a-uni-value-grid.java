class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> result = new ArrayList<Integer>();
        int n= grid.length;
        int m = grid[0].length;
        int operation =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               result.add(grid[i][j]);
            }
        }

        int mod = result.get(0)%x;
        for(Integer i : result){
            if(i%x != mod) return -1;
        }

        Collections.sort(result);
        int med= result.get(result.size()/2);
        for (Integer i : result){
            operation += (Math.abs(i-med))/x;
        }

        return operation;

    
    }
}