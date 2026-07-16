class Solution {
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int mx[]=new int[nums.length];
        int m=nums[0];
        for(int i=0;i<mx.length;i++){
            m=Math.max(m,nums[i]);
            mx[i]=m;
        }
        int preg[]=new int[mx.length];
        for(int i=0;i<mx.length;i++){
            preg[i]=gcd(nums[i],mx[i]);
        }
        Arrays.sort(preg);
        long s=0;
        int i=0,j=preg.length-1;
        while(i<j){
            s+=gcd(preg[i],preg[j]);
            i++;
            j--;
        }
        return s;    
    }
}