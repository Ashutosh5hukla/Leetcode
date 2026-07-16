class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        String str="123456789";
        helper(str,num);
        for(int i=0;i<num.size();i++){
            if(num.get(i)>=low && num.get(i)<=high)ans.add(num.get(i));
        }
        Collections.sort(ans);
        return ans;
    }
    void helper(String st, ArrayList<Integer> list){
    for(int i=0;i<st.length();i++){
        int num=0;
        for(int j=i;j<st.length();j++){
            num=num*10+(st.charAt(j)-'0');
            if(j>i)list.add(num);
        }
    }
    }
}