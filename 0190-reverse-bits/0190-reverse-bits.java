class Solution {
    public int reverseBits(int n) {
        String bs = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(bs);
        sb.reverse();
        return (int) Long.parseLong(sb.toString(), 2);
    }
}