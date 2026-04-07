class Solution {
    public int numJewelsInStones(String j, String st) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for(int i=0;i<j.length();i++){
            char ch = j.charAt(i);
            ans+=map.getOrDefault(ch,0);
        }
        return ans;
    }
}