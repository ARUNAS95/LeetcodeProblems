class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int count = 0;
        for(Integer i : set){
            if(!set.contains(i-1)){
               int current = i;
               int length = 1;
               while(set.contains(current+1)){
                current++;
                length++;
               }
               
               count = Math.max(count, length);

            } 
        }
        return count;
    }
}