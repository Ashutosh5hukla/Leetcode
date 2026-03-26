class Solution {
    public int removeElement(int[] arr, int val) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                arr[i]=-1;
            }else{
                c++;
            }
        }
        int i=0;
        int j=arr.length-1;
       while (i < j) {
            if (arr[i] == -1) {
                arr[i] = arr[j];
                arr[j] = -1;
                j--;
            } else {
                i++;
            }
        }

        return c;
    }
}