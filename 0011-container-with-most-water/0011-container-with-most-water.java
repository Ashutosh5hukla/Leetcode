class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int area=0;
        while(i<j){
            area=Math.max(area,Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]>arr[j])j--;
            else i++;
        }
        return area;
    }
}
