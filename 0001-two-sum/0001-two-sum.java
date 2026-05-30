class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> result = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int difference = target -nums[i];
        if(result.containsKey(difference)){
            return new int[] {result.get(difference), i};
        }
        result.put(nums[i],i);
       }
       return new int[]{};
    }
}