class Solution {
    public int singleNonDuplicate(int[] arr) {
        int s=0;
        int e=arr.length-1;
        if(arr.length==1)return arr[0];
        while(s<=e){
            int m=s+(e-s)/2;
            if(m>0 && m<e && arr[m-1]!=arr[m] && arr[m+1]!=arr[m])return arr[m];
            if(m==0 && arr[m]!=arr[m+1])return arr[m];
            if(m==e && arr[m-1]!=arr[m])return arr[m];
            if(m>0 && m<e && (arr[m]==arr[m-1]  || arr[m]==arr[m+1])){
                if(arr[m]==arr[m-1]){
                    if((m-1)%2==0)s=m+1;
                    else e=m-1;
                }
                else{//if(arr[m]==arr[m+1])
                    if(m%2==0)s=m+1;
                    else e=m-1;
                }
            }
        }
        return -1;
    }
}