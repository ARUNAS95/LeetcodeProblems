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
    class Pair{
        TreeNode node;
        int hd;
        int row;
        public Pair(TreeNode node , int hd, int row){
            this.node = node;
            this.hd = hd;
            this.row = row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        q.offer(new Pair(root,0,0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int hd = p.hd;
            int row = p.row;

            if(!map.containsKey(hd)){
                map.put(hd, new TreeMap<>());
            }
            map.get(hd).putIfAbsent(row, new ArrayList<>());
            map.get(hd).get(row).add(node.val);
            if(node.left !=null){
                q.offer(new Pair(node.left, hd-1, row+1));
            }
            if(node.right !=null){
                q.offer(new Pair(node.right, hd+1, row+1));
            }
        }

        for(TreeMap<Integer, List<Integer>> row: map.values()){
            List<Integer> a = new ArrayList<>();

            for(List<Integer> col: row.values()){
                Collections.sort(col);
                a.addAll(col);
            }
            ans.add(a);
        }

        return ans;

    }
}