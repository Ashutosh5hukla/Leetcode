class Solution {
    public long repairCars(int[] arr, int cars) {
        Arrays.sort(arr);
        long s=1;
        long e=1L*cars*cars*Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        long ans=e;
        while(s<=e){
            long m=s+(e-s)/2;
            if(check(arr,cars,m)){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    boolean check(int arr[],int cars,long minT){
        long carcnt=0;
        for(int i=0;i<arr.length;i++){
            carcnt+=(long)Math.sqrt(minT/arr[i]);
        }
        return carcnt>=cars;
    }
}