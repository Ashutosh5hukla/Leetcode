class Solution {
    public boolean lemonadeChange(int[] arr) {
        int f=0;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5)f++;
            else if(arr[i]==10){
                if(f<=0)return false;
                else{
                    t++;
                    f--;
                }
            }else{
                if(f>0 && t>0){
                    f--;
                    t--;
                }else if(f>=3){
                    f-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
       
        
    }
}
