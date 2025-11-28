class Solution {
    public String mostCommonWord(String p, String[] banned) {

        Set<String> ban = new HashSet<>();
        for(String b : banned){
            ban.add(b.toLowerCase());
        }

        HashMap<String, Integer> mp = new HashMap<>();
        StringBuilder s = new StringBuilder();

        for(int i = 0; i <= p.length(); i++){
            if(i < p.length() && Character.isLetter(p.charAt(i))){
                s.append(Character.toLowerCase(p.charAt(i)));
            } else {
                if(s.length() > 0){
                    String word = s.toString();
                    if(!ban.contains(word)){
                        mp.put(word, mp.getOrDefault(word, 0) + 1);
                    }
                    s.setLength(0); // reset
                }
            }
        }

        String res = "";
        int max = 0;
        for(String key : mp.keySet()){
            if(mp.get(key) > max){
                max = mp.get(key);
                res = key;
            }
        }
        return res;
    }
}
