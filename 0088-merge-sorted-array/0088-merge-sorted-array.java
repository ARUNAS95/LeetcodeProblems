class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int check = nums1.length-n;   
    int c=0;
    for (int i=check;i<nums1.length;i++){
        nums1[i]= nums2[c];
        c++;
    }
    Arrays.sort(nums1);
    }
}