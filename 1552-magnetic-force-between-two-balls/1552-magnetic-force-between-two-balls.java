class Solution {
    int mx(int arr[]){
        int m=0;
        for(int i=0;i<arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    public int maxDistance(int[] pos, int no) {
        int s=1;
        int e=mx(pos);
        int ans=1;
        Arrays.sort(pos);
        while(s<=e){
            int m=s+(e-s)/2;
            if(check(pos,no,m)){
                ans=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }
    boolean check(int arr[],int no,int dist){
        int i=0;
        int j=1;
        while(j<arr.length && no!=1){
            if(arr[j]-arr[i]>=dist){
                no-=1;
                i=j;
            }
            j++;
        }
        return no==1;
    }
}