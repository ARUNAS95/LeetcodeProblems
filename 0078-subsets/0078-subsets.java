class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
        List<Integer> subset = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, subset, res, 0);
        return res;

    }

    public static void dfs(int [] nums, List<Integer> subset, List<List<Integer>> res, int i){

        
        if(i>=nums.length){
            res.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(nums, subset, res, i+1);

        int n = subset.size()-1;
        subset.remove(n);
        dfs(nums, subset, res, i+1);


    }
}
