class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(char c : map.keySet())
            pq.offer(c);
        
        StringBuffer sb = new StringBuffer();
        while(! pq.isEmpty()) {
            char ch = pq.remove();
            for(int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
        
    }
}