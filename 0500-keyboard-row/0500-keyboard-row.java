class Solution {
    public String[] findWords(String[] arr) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        ArrayList<String> l = new ArrayList<>();

        for (String w : arr) {
            String s = w.toLowerCase();
            boolean ok1 = true, ok2 = true, ok3 = true;

            for (char ch : s.toCharArray()) {
                if (r1.indexOf(ch) == -1) ok1 = false;
                if (r2.indexOf(ch) == -1) ok2 = false;
                if (r3.indexOf(ch) == -1) ok3 = false;
            }

            if (ok1 || ok2 || ok3) l.add(w);
        }

        String ans[] = new String[l.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = l.get(i);

        return ans;
    }
}
