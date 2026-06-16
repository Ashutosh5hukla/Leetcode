class Solution {
    public String restoreString(String s, int[] in) {
        char arr[]=s.toCharArray();
        char ans[]=new char[in.length];
        for(int i=0;i<ans.length;i++){
            ans[in[i]]=arr[i];
        }
      return new String(ans);
    }
}