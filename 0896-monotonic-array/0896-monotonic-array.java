class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean as=true;
        boolean des=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])as=false;
            if(arr[i-1]<arr[i])des=false;
        }
        return (as || des);
    }
}