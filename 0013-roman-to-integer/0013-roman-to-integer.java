class Solution {
    public int romanToInt(String s) {
        int res = 0;//ans
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        System.out.println(map);
        for(int i=0; i< n; i++){
            int value = map.get(s.charAt(i));
            if(i+1 < n && value < map.get(s.charAt(i+1)) ){
                res = res-value;
            } else {
                res = res+value;
            }
        }
        return res;
    }
}