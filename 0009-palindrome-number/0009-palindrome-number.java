class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        String s = String.valueOf(x);
        return sb.reverse().toString().equals(s);
    }
}
