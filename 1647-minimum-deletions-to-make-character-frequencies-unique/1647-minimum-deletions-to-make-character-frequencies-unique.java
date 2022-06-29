class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        HashMap<Integer, Integer> checkMap = new HashMap<>();
        int result = 0;
        for(char key : map.keySet()) {
            int i = map.get(key);
            
            if(checkMap.containsKey(i)) {
                while(checkMap.containsKey(i)) {
                    i--;
                    result++;
                }
                if(i > 0) {
                    checkMap.put(i, 1);
                }
            }
            else
                checkMap.put(i, 1);
        }
        return result;
    }
}