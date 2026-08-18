public class Solution {
    public void Merge(int[] n1, int m, int[] n2, int n) {
        int[] ans=new int[m+n];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(n1[i]<n2[j])ans[k++]=n1[i++];
            else ans[k++]=n2[j++];
        }

        while(i<m)ans[k++]=n1[i++];

        while(j<n)ans[k++]=n2[j++];

        for(int x=0;x<m+n;x++)n1[x]=ans[x];
    }
}