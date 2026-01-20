class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        boolean vis[]=new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int t=q.remove();
            for(int i=0;i<adj.get(t).size();i++){
                if(!vis[adj.get(t).get(i)]){
                    q.add(adj.get(t).get(i));
                    vis[adj.get(t).get(i)]=true;
                }
            }
        }
        for(int i=0;i<vis.length;i++){
            if(!vis[i])return false;
        }
        return true;
    }
}