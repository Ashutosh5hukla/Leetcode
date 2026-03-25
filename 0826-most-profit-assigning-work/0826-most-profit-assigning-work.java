import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<int[]> list = new ArrayList<>();
        // (difficulty, profit)
        for (int i = 0; i < difficulty.length; i++) {
            list.add(new int[]{difficulty[i], profit[i]});
        }
        // sort by difficulty
        list.sort((a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int mp=0;
        int res=0;
        int j=0;
        for(int i=0;i<worker.length;i++){
            while(j<list.size() && list.get(j)[0]<=worker[i]){
                mp=Math.max(mp,list.get(j)[1]);
                j++;
            }
            res+=mp;
        }
        return res;
    }
}