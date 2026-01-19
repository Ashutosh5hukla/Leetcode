class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int s=1;
        int e=10000000;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(helper(dist,hour,m)){
                ans=m;
                e=m-1;
            }else s=m+1;
        }
        return ans;
    }
    boolean helper(int arr[],double hr,int s){
        double c=0;
        for(int i=0;i<arr.length;i++){
            double t=(double)arr[i]/s;
            if(i!=arr.length-1)c+=Math.ceil(t);
            else c+=t;
        }
        return c<=hr;
    }
}