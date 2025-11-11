import java.util.*;
class Solution{
    public int specialArray(int[] arr){
        Arrays.sort(arr);
        int n=arr.length,s=0,e=n,x=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            int l=lb(arr,m);
            int count=n-l;
            if(count==m){x=m;s=m+1;}
            else if(count>m)s=m+1;
            else e=m-1;
        }
    return x;
    }
    private int lb(int[] arr,int x){
        int l=0,r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=x)r=mid;
            else l=mid+1;
        }
        return l;
    }
}
