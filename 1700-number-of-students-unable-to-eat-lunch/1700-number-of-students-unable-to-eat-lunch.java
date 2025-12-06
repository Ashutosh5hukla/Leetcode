class Solution {
    public int countStudents(int[] s, int[] l) {
        int n = s.length;
        boolean[] eaten = new boolean[n];

        int served = 0; 
        int i = 0;    
        int j = 0;    
        int rotations = 0;

        while(j < n && rotations < n){
            if(!eaten[i] && s[i] == l[j]){ 
                eaten[i] = true;
                served++;
                j++;
                rotations = 0; 
            } else {
                rotations++; 
            }
            i = (i + 1) % n;
        }

        return n - served;
    }
}
