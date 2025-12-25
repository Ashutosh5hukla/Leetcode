class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[] = new int[26];
        boolean used[] = new boolean[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            freq[idx]--;
            if (used[idx]) continue;
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
                used[st.pop()-'a']=false;

            }
            st.push(ch);
            used[ch-'a']=true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        return sb.toString();
    }
}
