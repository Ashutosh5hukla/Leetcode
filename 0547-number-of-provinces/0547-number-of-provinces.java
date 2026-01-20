class Solution {
    public int findCircleNum(int[][] adj) {
        boolean vis[]=new boolean[adj.length];
        int c=0;
        for(int i=0;i<adj.length;i++){
            if(!vis[i]){
                bfs(adj,vis,i);
                c++;
            }
        }
        return c;
    }
    public void bfs(int[][] adj,boolean vis[],int i){
        vis[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int f=q.remove();
            for(int j=0;j<adj.length;j++){
                if(adj[f][j]==1 && !vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }
    }
}