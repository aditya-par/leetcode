class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums2.length;
        for(int i = n-1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() <= nums2[i]) {
                stk.pop();
            }
            
            if(!stk.isEmpty()) {
                map.put(nums2[i], stk.peek());
            }
            else
                map.put(nums2[i], -1);
            
            stk.push(nums2[i]);
        }
        
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        
        return nums1;
    }
}