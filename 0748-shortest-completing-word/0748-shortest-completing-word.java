class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] need = new int[26];
        for(char ch : licensePlate.toCharArray()){
            if(Character.isLetter(ch)){
                need[Character.toLowerCase(ch) - 'a']++;
            }
        }
        String shortest = null;
        for(String word : words){
            int[] freq = new int[26];

            for(char ch : word.toCharArray()){
                freq[ch - 'a']++;
            }

            boolean valid = true;
            for(int i = 0; i < 26; i++){
                if(freq[i] < need[i]){
                    valid = false;
                    break;
                }
            }
            if(valid && (shortest == null || word.length() < shortest.length())){
                shortest = word;
            }
        }

        return shortest;
    }
}
