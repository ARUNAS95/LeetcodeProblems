class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] vis = new boolean[isConnected.length+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        int v = isConnected[0].length;
        for(int i =0;i<isConnected.length;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }

        for(int i=0;i<isConnected.length;i++){
            if(vis[i] == false){
                count++;
                dfs(i, adj, vis);
            }
        }

        return count;

    }

    private void dfs(int node,ArrayList<ArrayList<Integer>> adj, boolean[] vis ){
        vis[node] = true;

        for(Integer i: adj.get(node)){
            if(vis[i]==false){
                dfs(i, adj, vis);
            }
        }

    }
}