public class Pair {
    int val;
    int gap;
    
    Pair(int _val, int _gap) {
        val = _val;
        gap = _gap;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> ((b.gap == a.gap) ? b.val - a.val : b.gap - a.gap));
        
        for(int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
            if(pq.size() > k) {
                pq.remove();
            }
        }
        
        List<Integer> list = new ArrayList();
        while(!pq.isEmpty()) {
            list.add(pq.remove().val);
        }
        
        Collections.sort(list);
        return list;
     }
}