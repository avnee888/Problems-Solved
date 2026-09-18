class Solution {
    public int findCenter(int[][] edges) {

        int n = edges.length + 1;

        ArrayList<List<Integer>> adj = new ArrayList<>();

        // Create lists for nodes 0 to n
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Create adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Find node having n-1 neighbors
        for (int i = 1; i <= n; i++) {
            if (adj.get(i).size() == n - 1) {
                return i;
            }
        }

        return -1;
    }
}