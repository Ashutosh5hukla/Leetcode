class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> ans=new ArrayList<>();
       String o="1",z="0";

        helper(n-1,ans,o);
        helper(n-1,ans,z);
        return ans;
    }
    void helper(int n,ArrayList<String> ans,String str){
        if(n==0){
            ans.add(str);
            return;
        }
        if(str.charAt(str.length()-1)=='0')helper(n-1,ans,str+"1");
        else{
            helper(n-1,ans,str+"1");
            helper(n-1,ans,str+"0");
        }
        return;
    }
}