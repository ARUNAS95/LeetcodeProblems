class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unPlaced = fruits.length;
        for(int i=0;i<=fruits.length-1;i++){
            for(int j=0;j<=baskets.length-1;j++){
                if(baskets[j]>=fruits[i] && baskets[j]!=0){
                    unPlaced--;
                    baskets[j]=0;
                    break;
                } else{
                    continue;
                }
            }
        }
        return unPlaced;
        
    }
}