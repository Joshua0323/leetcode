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
    private int maxDistance = 0;

    public int amountOfTime(TreeNode root, int start) {
        traverse(root, start);
        return maxDistance;
    }

    private int traverse(TreeNode root, int start) {
        int depth = 0;
        if(root == null) {
            return depth;
        }

        int leftDepth = traverse(root.left, start);
        int rightDepth = traverse(root.right, start);
        
        if(root.val == start) {
            maxDistance = Math.max(leftDepth, rightDepth);
            depth = -1;
        } else if(leftDepth >= 0 && rightDepth >= 0) {
            depth = Math.max(leftDepth, rightDepth) + 1;
        } else {
            int distance = Math.abs(leftDepth) + Math.abs(rightDepth);
            maxDistance = Math.max(maxDistance, distance);
            depth = Math.min(leftDepth, rightDepth) - 1;
        }
        return depth;
    }
}

// class Solution {
//     private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

//     public int amountOfTime(TreeNode root, int start) {
//         convertToGraph(root);
//         Deque<Integer> queue = new ArrayDeque<>();
//         Set<Integer> visited = new HashSet<>();
      
//         queue.offer(start);
//         int time = -1; 
      
//         while (!queue.isEmpty()) {
//             time++;
//             for (int i = queue.size(); i > 0; i--) {
//                 int currentNode = queue.pollFirst();
//                 visited.add(currentNode);
              
//                 if (adjacencyList.containsKey(currentNode)) {
//                     for (int neighbor : adjacencyList.get(currentNode)) {
//                         if (!visited.contains(neighbor)) {
//                             queue.offer(neighbor);
//                         }
//                     }
//                 }
//             }
//         }
//         return time;
//     }

//     private void convertToGraph(TreeNode node) {
//         if (node == null) {
//             return;
//         }
      
//         if (node.left != null) {
//             adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
//             adjacencyList.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
//         }
      
//         if (node.right != null) {
//             adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
//             adjacencyList.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
//         }
      
        
//         convertToGraph(node.left);
//         convertToGraph(node.right);
//     }
// }