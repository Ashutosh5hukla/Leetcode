class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        TreeMap<Integer, List<List<String>>> map = new TreeMap<>();

        for(int i=0;i<events.size();i++){
            List<String> event = events.get(i);
            int key = Integer.parseInt(event.get(1));

            if(map.containsKey(key)){
                List<List<String>> temp = map.get(key);
                temp.add(event);
                map.put(key, temp);
            } else {
                List<List<String>> temp = new ArrayList<>();
                temp.add(event);
                map.put(key, temp);
            }
        }

        int [] ans = new int[numberOfUsers];
        int [] offline = new int[numberOfUsers];
        for (Map.Entry<Integer, List<List<String>>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<List<String>> values = entry.getValue();

            for(int i=0;i<numberOfUsers;i++){
                if(offline[i] + 60 <= key){
                    offline[i] = 0;
                }
            }

            for(int i=0;i<values.size();i++){
                List<String> value = values.get(i);
                if(value.get(0).equals("OFFLINE")){
                    offline[Integer.parseInt(value.get(2))] = key;
                }
            }

            for(int i=0;i<values.size();i++){
                List<String> value = values.get(i);
                if(value.get(0).equals("MESSAGE")){
                    String msg = value.get(2);

                    if(msg.equals("ALL")){
                        for(int j=0;j<numberOfUsers;j++){
                            ans[j] = ans[j] + 1;
                        }
                    }
                    else if(msg.equals("HERE")){
                        for(int j=0;j<numberOfUsers;j++){
                            if(offline[j] == 0){
                                ans[j] = ans[j] + 1;
                            }
                        }
                    } else {
                        String arr [] = msg.split(" ");
                        for(int j=0;j<arr.length;j++){
                            int temp = Integer.parseInt(arr[j].substring(2));
                            ans[temp] = ans[temp] + 1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}