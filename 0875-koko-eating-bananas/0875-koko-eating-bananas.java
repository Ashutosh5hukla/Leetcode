class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int s=1;
        int e=Arrays.stream(arr).max().getAsInt();
        int ans=e;
        while(s<=e){
            int m=s+(e-s)/2;
            if(valid(m,arr,h)){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    boolean valid(int m,int[] arr,int h){
        long minh=0;
        for(int i=0;i<arr.length;i++){
            minh+=(int)Math.ceil((double)arr[i]/m);
        }
        return minh<=h;
    }
}