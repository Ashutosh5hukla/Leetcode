class Solution {
    int bitwiseComplement(int n) {
        int mask=n|1;//edgecase n==0
        for (int i = 0; i <= 4; i++)
            mask |= mask >> (1 << i);
        return n^mask;
    }
}