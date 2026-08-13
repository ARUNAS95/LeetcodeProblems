class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max = 0;
        int water_level = 0;
        while(left< right){
            if(height[left] < height[right]){
                if(left_max < height[left]){
                    left_max = height[left];
                } else {
                    int a = left_max - height[left];
                    water_level += a;   
                }
                left++;
            }
            else{
                if(right_max < height[right]){
                    right_max = height[right];
                }
                else {
                    int a = right_max - height[right];
                    water_level += a; 
                    }

                right --;
                }
                
            }
            return water_level;
        }
}