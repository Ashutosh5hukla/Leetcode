class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> list=new ArrayList<>();
        help("a",1,n,list);
        help("b",1,n,list);
        help("c",1,n,list);
        Collections.sort(list);
        if(k > list.size()) return "";
        return list.get(k-1);
    }
    void help(String s,int i,int n,ArrayList<String> list){
        if(i==n){
            list.add(s);
            return;
        }
        if(s.charAt(i-1)=='a'){
            help(s+"b",i+1,n,list);
            help(s+"c",i+1,n,list);
        }else if(s.charAt(i-1)=='b'){
            help(s+"a",i+1,n,list);
            help(s+"c",i+1,n,list);
        }if(s.charAt(i-1)=='c'){ 
            help(s+"a",i+1,n,list);
            help(s+"b",i+1,n,list);
        }

    }
}