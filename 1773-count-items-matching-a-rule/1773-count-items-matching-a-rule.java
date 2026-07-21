class Solution {
    public int countMatches(List<List<String>> items, String rk, String rv) {
        int x = rk.equals("type") ? 0 : rk.equals("color") ? 1 : 2;
        int ans=0;
        for(List<String> item:items){
            if(item.get(x).equals(rv)) ans++;
        }
        return ans;
    }
}