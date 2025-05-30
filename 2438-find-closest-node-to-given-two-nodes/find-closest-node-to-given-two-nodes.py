class Solution(object):
    def dfs(self, current, distance, edges, distances):
        # self.dfs(-1, 3, [2,2,3,-1], [0, -1, 1, 2])
        
        while current != -1 and distances[current] == -1:
            distances[current] = distance
            distance += 1
            current = edges[current]

    def closestMeetingNode(self, edges, node1, node2):
        res, Min_Of_Max, n = -1, float('inf'), len(edges)
        dist1 = [-1] * n
        dist2 = [-1] * n
        self.dfs(node1, 0, edges, dist1)
        self.dfs(node2, 0, edges, dist2)
        # self.dfs(-1, 3, [1,2,-1], [0, 1, 2])
        # self.dfs(-1, 1, [1,2,-1], [-1, -1, 0])
        for i in range(n):
            if dist1[i] >= 0 and dist2[i] >= 0:
                maxDist = max(dist1[i], dist2[i])  # 2
                if maxDist < Min_Of_Max:
                    Min_Of_Max = maxDist
                    res = i
        return res
