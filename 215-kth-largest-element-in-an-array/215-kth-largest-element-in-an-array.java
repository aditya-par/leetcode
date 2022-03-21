class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : nums) {
            pq.offer(i);
        }
        
        System.out.println(pq);
        int val = 0;
        while(k-- != 0) {
            val = pq.poll();
        }
        
        return val;
    }
}