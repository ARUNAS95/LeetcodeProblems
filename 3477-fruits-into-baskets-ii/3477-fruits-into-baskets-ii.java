class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int count = fruits.length;
        boolean[] visited = new boolean[baskets.length];
        for(int i =0;i< fruits.length;i++){
            for(int j=0;j< baskets.length;j++){
                if(visited[j] != true && fruits[i] <= baskets[j])
                {
                    count--;
                    visited[j] = true;
                    break;
                }
                
            }
        }

        return count;
    }
}