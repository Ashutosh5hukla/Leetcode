class Solution {
    public int countConsistentStrings(String al, String[] w) {
        int arr[]=new int[27];
        for(int i=0;i<al.length();i++){
            arr[al.charAt(i)-'a']=1;
        }
        int c=0;
        for(String s: w){
            boolean f=true;
            for(int i=0;i<s.length();i++){
                if(arr[s.charAt(i)-'a']!=1){
                    f=false;
                    break;
                }
            }
            if(f)c++;
        }
        return c;
    }
}