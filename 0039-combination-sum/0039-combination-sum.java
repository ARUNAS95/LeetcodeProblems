class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> sub = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        int i = 0;
        dfs(nums, sub, res, sum, target, i);
        return res;
    }

    public static void dfs(int[] nums, List<Integer> sub, List<List<Integer>> res, int sum, int target, int i){


        if(sum == target){
            res.add(new ArrayList(sub));
            return;
        }
        if(i>=nums.length || sum > target){
            return;
        }

        for(int k=i; k<nums.length;k++)
        {
            if(nums[k]> target) continue;

            sub.add(nums[k]);
            dfs(nums, sub, res, sum+nums[k], target, k);
            sub.remove(sub.size()-1);
        }
      

    }
}
