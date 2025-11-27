class Solution {
    public int[] numberOfLines(int[] w, String str) {
       int line=1;
       int totalw=0;
       for(int i=0;i<str.length();i++){
        int currW=w[str.charAt(i)-'a'];
            if(currW +totalw > 100){
                line++;
                totalw=currW;
            }else{
                totalw+=currW;
            }
       }
        
        return new int[]{line,totalw};
    }
}