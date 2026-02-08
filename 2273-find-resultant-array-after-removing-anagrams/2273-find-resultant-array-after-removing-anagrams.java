class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ls=new ArrayList<>();
        int l=0;
        int r=1;
        while(r<words.length){
            String s1=words[l];
            while(r<words.length && eq(s1,words[r]))r++;
            ls.add(s1);
            l=r;
            r++;
        }
        if (l < words.length) {
            ls.add(words[l]);
        }
        return ls;
    }
    boolean eq(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i])return false;
        }
        return true;
    }
}