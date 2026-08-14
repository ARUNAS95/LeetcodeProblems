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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        List<Long> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level = q.size();
            long sum = 0;
            for(int i=0;i<level;i++){
                TreeNode node = q.poll();
                sum = sum + (long) node.val;

                if(node.left !=null) q.offer(node.left);

                if(node.right !=null) q.offer(node.right);
            }

            ans.add(sum);
        } 
        Collections.sort(ans);
        
        return ans.size()<k ? -1 : ans.get(ans.size() - k);
    }
}