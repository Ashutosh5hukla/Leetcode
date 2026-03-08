class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split("\\s+");
        // System.out.print(Arrays.asList(arr).toString());
        return arr[arr.length-1].length();
    }
}