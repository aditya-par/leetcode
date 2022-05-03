class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int[] nge = new int[n];
        
        for(int i = 2*n-1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() <= nums[i%n]) {
                stk.pop();
            }
            if(i < n) {
                if(!stk.isEmpty())
                    nge[i] = stk.peek();
                else
                    nge[i] = -1;
            }
            
            stk.push(nums[i%n]);
        }
        
        return nge;
    }
}