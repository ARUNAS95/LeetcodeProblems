class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[nums2.length];
        while(i<nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if( nums1[i] > nums2[j]){
                j++;
            } else {
                if (k == 0 || nums1[i] != ans[k - 1]) {
                    ans[k++] = nums1[i];
                }
                j++;
            }
        }

        return Arrays.copyOfRange(ans, 0,k);
    }
}