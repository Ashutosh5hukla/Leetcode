class Solution {
    int smallestRepunitDivByK(int k) {
        int rem = 0,length = 0;
        if(k % 2 == 0 || k%5 == 0) return -1;
        for( int i = 0;i<k;i++){
            rem = (rem*10+1)% k;
            length += 1;
            if(rem == 0) return length;
        }
         return -1;    
    }
}