class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String str : words){
            if(pal(str))return str;
        }
        return "";
    }
    boolean pal(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        return s.equals(sb.toString());        
    }
}