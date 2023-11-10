class Solution {
    Map<Integer, List<Integer>> graph = new HashMap();
    
    public int[] restoreArray(int[][] adjacentPairs) {
        for (int[] edge : adjacentPairs) {
            int x = edge[0];
            int y = edge[1];
            
            if (!graph.containsKey(x)) {
                graph.put(x, new ArrayList());
            }
            
            if (!graph.containsKey(y)) {
                graph.put(y, new ArrayList());
            }
            
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        int root = 0;
        for (int num : graph.keySet()) {
            if (graph.get(num).size() == 1) {
                root = num;
                break;
            }
        }
        
        int[] ans = new int[graph.size()];
        dfs(root, Integer.MAX_VALUE, ans, 0);
        return ans;
    }
    
    private void dfs(int node, int prev, int[] ans, int i) {
        ans[i] = node;
        for (int neighbor : graph.get(node)) {
            if (neighbor != prev) {
                dfs(neighbor, node, ans, i + 1);
            }
        }
    }
}

// class Solution {
//     public int[] restoreArray(int[][] adjacentPairs) {
//         int num_size = adjacentPairs.length + 1;
//         int[] res = new int[num_size];

//         ArrayList<Integer> list = new ArrayList<Integer>();       
        
//         for (int i = 0; i < adjacentPairs.length; i++) {
//             for (int j = 0; j < 2;j++) {
//                 res[i]=adjacentPairs[i][j];
//             }
//         }
        
        
//         for(int i = 0; i < adjacentPairs.length; i++) {
//             list.add(adjacentPairs[i][0]);
//             list.add(adjacentPairs[i][1]);
//         }
        
//         int count = 1;
        
//         for(int i = 0; i < list.length; i++) {
//             if(count == 1) {
//                 list.add(0, )
//             }
//         }
        
        
//         Set<Integer> set = new HashSet<Integer>(list);
//         Iterator<Integer> iter = set.iterator();
//         int j = 0;
//         while(iter.hasNext()) {
//             res[j] = iter.next();
//             if(!iter.hasNext()) {
//                 break;
//             }
//             j++;
//         }

        
//         return res;
//     }
// }