class Solution {
    public int countPartitions(int[] arr) {
        int n=arr.length;
        Integer pre[]=new Integer[n];
        int count=0;
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        // System.out.print((Arrays.asList(pre)).toString());
        int i=0,j=n-1;
        while(i<j){
            int x=2*pre[i]-pre[j];
            if(x%2==0)count++;
            i++;
        }
        return count;
    }
}