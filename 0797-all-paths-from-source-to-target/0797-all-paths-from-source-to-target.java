class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        dfs(graph,res,l,0);
        return res;
    }
    void dfs(int[][] graph,List<List<Integer>> res,ArrayList<Integer> list,int s){
        if(s==graph.length-1){
            res.add(new ArrayList<>(list)); 
            return;
        }
        for(int i=0;i<graph[s].length;i++){
            list.add(graph[s][i]);
            dfs(graph,res,list,graph[s][i]);
            list.remove(list.size()-1);
        }

    }
}