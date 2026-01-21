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
        bfs(adj,vis,s);
        return vis[d];
    }
    void bfs(List<List<Integer>> adj,boolean vis[],int s){
        vis[s]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int t=q.remove();
            for(int i=0;i<adj.get(t).size();i++){
                if(!vis[adj.get(t).get(i)]){
                    q.add(adj.get(t).get(i));
                    vis[adj.get(t).get(i)]=true;
                }
            }
        }
    }
}