class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recPermute(ans, ds,freq, nums);
        return ans;
    }  

    void recPermute(List<List<Integer>> ans, List<Integer> ds, boolean[] freq, int[] nums){

        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recPermute(ans, ds, freq, nums);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
}