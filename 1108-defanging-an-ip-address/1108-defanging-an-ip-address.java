class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            ans += arr[i];
            if(i != arr.length-1){
                ans += "[.]";
            }
        }
        return ans;
    }
}