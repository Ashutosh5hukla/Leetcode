class Solution {
    public int[] successfulPairs(int[] sp, int[] po, long s) {
        Arrays.sort(po);
        int ans[]=new int[sp.length];
        for(int i=0;i<sp.length;i++){
                ans[i]=helper(sp[i],po,s);
        }
        return ans;
    }
    int helper(int sp,int arr[],long t){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if((long)arr[m]*sp>=t){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }    
        }
        if(ans==-1)return 0;
        return arr.length-ans;
    }
}