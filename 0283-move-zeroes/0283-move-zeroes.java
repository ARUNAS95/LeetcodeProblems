class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        for(int last= 0;last<nums.length;last++){
            if(nums[last] != 0){
                int temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
                first++;
            }
            
            
        }
       
        
    }
}