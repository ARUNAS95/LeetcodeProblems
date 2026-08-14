/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void buildParent(TreeNode root, Map<TreeNode, TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                map.put(node.left, node);
                q.offer(node.left);
            }
             if(node.right!=null){
                map.put(node.right, node);
                q.offer(node.right);
            }
        }

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        buildParent(root, map);
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        q.offer(target);
        visited.put(target, true);
        int distance = 0;

        while(!q.isEmpty()){
            int level = q.size();

            if(distance == k) break;
            distance++;

            for(int i=0;i<level;i++){
                TreeNode node = q.poll();

                if(node.left !=null && visited.get(node.left) == null){
                    q.offer(node.left);
                    visited.put(node.left, true);
                }

                if(node.right != null && visited.get(node.right) == null){
                    q.offer(node.right);
                    visited.put(node.right, true);
                }

                if(map.get(node) !=null && visited.get(map.get(node)) == null){
                    q.offer(map.get(node));
                    visited.put(map.get(node), true);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            ans.add(node.val);
        }
        return ans;
    }
}