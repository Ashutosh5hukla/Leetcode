class Solution {
    public int closestTarget(String[] w, String t, int si) {
        int n = w.length;
        if (w[si].equals(t)) return 0;
        int i=(si-1+n)%n;
        int j=(si+1)%n;
        int is=1;
        int ls=1;
        while (i != si || j != si) {
            if(w[i].equals(t))return is;
            if(w[j].equals(t))return ls;
            is++;
            ls++;
            i=(i-1+n)%n;
            j=(j+1)%n;
        }
        return -1;
    }
}