class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int freq[]=new int[51];
        int pre=0;
        int ans[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            freq[B[i]]++;
            if(A[i]!=B[i]){
                if(freq[A[i]]==2)pre+=1;
                if(freq[B[i]]==2)pre+=1;
                ans[i]=pre;
            }else{
                pre+=1;
                ans[i]=pre;
            }
        }
        return ans;
    }
}