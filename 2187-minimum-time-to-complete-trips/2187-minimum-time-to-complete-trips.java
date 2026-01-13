class Solution {
    public long minimumTime(int[] time, int tt) {
    
        long s=1;
        long min=Integer.MAX_VALUE;
        for(int ele : time)min=Math.min(ele,min);
        long e=min*tt;

        while(s<=e){
            long m=s+(e-s)/2;

            long t=0;
            for(int ele: time){
                t+=(m/ele);
            }

            if(t>=tt)e=m-1;
            else s=m+1;
        }
        return s;
        
    }
}