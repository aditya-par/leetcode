class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            pq.add(stone);
        }
        
        while(pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            int diff = first - second;
            pq.add(diff);
        }
        
        return pq.remove();
    }
}