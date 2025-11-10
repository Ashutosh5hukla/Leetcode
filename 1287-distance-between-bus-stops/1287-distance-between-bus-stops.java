class Solution {
    public int distanceBetweenBusStops(int[] dis, int s, int e) {
        int n=dis.length;
        int arr[]=new int[n];
        int a=0;
        if(s>e){
            int t=s;
            s=e;
            e=t;
        }
        for(int i=s;i<e;i++){
            a+=dis[i];
            arr[i]=-1;
        }
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=-1)b+=dis[i];
        }
        return Math.min(a,b);
    }
}