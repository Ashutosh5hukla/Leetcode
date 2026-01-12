class Solution {
    public int addDigits(int num) {
        
        while(num>=10){
            int t=num;
            num=0;
            while(t!=0){
                int dig=t%10;
                num+=dig;
                t/=10;
            }
        }
        return num;
    }
}