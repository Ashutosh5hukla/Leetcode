class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : deck) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }          
        int g = 0;
        for (int freq : map.values()) {
            g = gcd(g, freq);
        }

        return g > 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
