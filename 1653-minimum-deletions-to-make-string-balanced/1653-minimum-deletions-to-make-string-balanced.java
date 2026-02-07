class Solution {
    public int minimumDeletions(String s) {
        int cnt = 0;
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek()=='b' && c=='a') {
                st.pop();
                cnt++;
            }else {
                st.push(c);
            }
        }
        return cnt;
    }
}