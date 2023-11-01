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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap();
        dfs(root, counter);
        int maxFreq = 0;
        
        for (int key : counter.keySet()) {
            maxFreq = Math.max(maxFreq, counter.get(key));
        }
        
        List<Integer> ans = new ArrayList();
        for (int key : counter.keySet()) {
            if (counter.get(key) == maxFreq) {
                ans.add(key);
            }
        }
        
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
    
    public void dfs(TreeNode node, Map<Integer, Integer> counter) {
        if (node == null) {
            return;
        }
        
        counter.put(node.val, counter.getOrDefault(node.val, 0) + 1);
        dfs(node.left, counter);
        dfs(node.right, counter);
    }
}

// class Solution {
//     public int[] findMode(TreeNode root) {
//         List<Integer> list = new ArrayList<Integer>();
//         int[] res = new int[1];        
        
//         TreeNode upNode = new TreeNode();
//         TreeNode currentNode = new TreeNode();
//         TreeNode leftNode = new TreeNode();
//         TreeNode rightNode = new TreeNode();
                
//         currentNode = root;
//         leftNode = root.left;
//         rightNode = root.right;
        
//         if (currentNode.left == null && currentNode.right == null) {
//             res[0] = root.val;
//         }              
        
//         while(currentNode.left != null || currentNode.right != null) {
//             if (currentNode.right != null) {
//                 currentNode = currentNode.right;
//             } else {
//                 currentNode = currentNode.left;
//             }
//             res[0] = currentNode.val;
//         }


//         return res;
//     }
// }