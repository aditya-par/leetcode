class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            pq.add(stone);
        }
        
        int n = stones.length;
        while(n != 1) {
            int first = pq.remove();
            int second = pq.remove();
            
            int diff = first - second;
            pq.add(diff);
            n--;
        }
        
        return pq.remove();
    }
}