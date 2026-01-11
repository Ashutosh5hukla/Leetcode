class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] arr, int t) {
        int ans=0;
        for(int ele:arr){
            if(ele>=t)ans++;
        }
        return ans;

    }
}