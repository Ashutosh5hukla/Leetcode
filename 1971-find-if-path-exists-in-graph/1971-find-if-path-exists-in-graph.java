class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        boolean vis[]=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        dfs(adj,vis,s);
        return vis[d];
    }
    void dfs(List<List<Integer>> adj,boolean vis[],int s){
        vis[s]=true;
       for(int i=0;i<adj.get(s).size();i++){
        if(!vis[adj.get(s).get(i)]){
            dfs(adj,vis,adj.get(s).get(i));
        }
       }
    }
}