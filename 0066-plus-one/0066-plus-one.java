class Solution {
    public int[] plusOne(int[] d) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<d.length;i++){
            ls.add(d[i]);
            }
        Collections.reverse(ls);
        int c=0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)==9){
                ls.set(i,0);
                c=1;
            }else{
                if(c==1)c=0;
                ls.set(i,ls.get(i)+1);
                break;
            }
        }
        if(c==1)ls.add(1);
        Collections.reverse(ls);
        int ans[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}//8999 9998 000