class Solution{
    public int findInMountainArray(int t,MountainArray ma){
        int p=piv(ma);
        int ans=bsa(t,ma,0,p);
        int r=bsd(t,ma,p+1,ma.length()-1);
        if(ans==-1)return r;
        if(r==-1)return ans;
        return Math.min(ans,r);
    }
    int piv(MountainArray arr){
        int s=1,e=arr.length()-2;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr.get(m-1)<arr.get(m)&&arr.get(m)>arr.get(m+1))return m;
            else if(arr.get(m-1)>arr.get(m))e=m-1;
            else s=m+1;
        }
        return -1;
    }
    int bsa(int t,MountainArray arr,int s,int e){
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            int v=arr.get(m);
            if(v==t){
                ans=m;
                e=m-1;
            }
            else if(v<t)s=m+1;
            else e=m-1;
        }
        return ans;
    }
    int bsd(int t,MountainArray arr,int s,int e){
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            int v=arr.get(m);
            if(v==t){
                ans=m;
                e=m-1;
            }
            else if(v>t)s=m+1;
            else e=m-1;
        }
        return ans;
    }
}
