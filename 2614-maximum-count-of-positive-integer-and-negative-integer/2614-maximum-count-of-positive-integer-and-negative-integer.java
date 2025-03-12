class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]<0){
                neg++;
            } else if(nums[i]>0){
                System.out.println(nums[i]);
                pos++;
            }
        }
        if(pos> neg){
            return pos;
        }
        return neg;
        
    }
}