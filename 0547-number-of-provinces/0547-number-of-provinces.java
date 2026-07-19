class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] vis = new boolean[isConnected.length+1];
    
        for(int i=0;i<isConnected.length;i++){
            if(vis[i] == false){
                count++;
                dfs(i,isConnected , vis);
            }
        }

        return count;

    }

    private void dfs(int node, int[][] isConnected, boolean[] vis ){
        vis[node] = true;

        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && vis[i]==false){
                dfs(i, isConnected, vis);
            }
        }

    }
}