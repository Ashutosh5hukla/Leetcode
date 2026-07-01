class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        ArrayList<Integer>[] groups = new ArrayList[gs.length + 1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < gs.length; i++) {
            if (groups[gs[i]] == null)
                groups[gs[i]] = new ArrayList<>();
            groups[gs[i]].add(i);
        }

        for (int i = 1; i <= gs.length; i++) {
            if (groups[i] == null) continue;

            ArrayList<Integer> list = groups[i];

            for (int j = 0; j < list.size(); j += i) {
                ans.add(new ArrayList<>(list.subList(j, j + i)));
            }
        }
        return ans;


        
    }
}