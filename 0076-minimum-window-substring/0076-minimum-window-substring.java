class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int size=map.size();
        int i=0,j=0,min=s.length()+1,left=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)==0)size--;
            }
            else map.put(ch,map.getOrDefault(ch,0)-1);
            j++;
            while(size==0){
                if(j-i<min){
                    min=j-i;
                    left=i;
                }
                char c1=s.charAt(i);
                map.put(c1,map.getOrDefault(c1,0)+1);
                if(map.get(c1)==1) size++;
                i++;
            }
        }
        if(min==s.length()+1)  return "";
        return s.substring(left,left+min);
    }
}