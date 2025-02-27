class Solution {
    public int countPartitions(int[] nums) {
       int left = 0;
       int right = nums.length -1;
       int count = 0;
       while(left < right){
        int leftArray = 0;
        int rightArray = 0;
       for (int i=0 ; i<=left;i++){
            leftArray += nums[i] ;
       }
       if(left<nums.length-1){
       for(int i=left+1; i<=right;i++){
            rightArray += nums[i];
       }
       }
       int sum = leftArray - rightArray;
       if(sum % 2 ==0){
        count++;
       }
       left++;
       
       }
       return count;
    }
}