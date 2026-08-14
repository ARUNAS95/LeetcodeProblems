/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L,1);
        return buildSum(root, targetSum, 0L, map);


    }

    private int buildSum(TreeNode root, int target, long currSum, HashMap<Long, Integer> map){
        if(root == null){
            return 0;
        }

        currSum += root.val;

        long a = currSum - target;

        int count = map.getOrDefault(a,0);

        map.put(currSum, map.getOrDefault(currSum, 0) +1);

        count += buildSum (root.left, target, currSum, map);

        count += buildSum (root.right, target, currSum, map);

        map.put(currSum, map.get(currSum) -1);

        return count;
        
    }
}