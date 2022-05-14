class Solution {
    public int findClosestNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], Math.abs(nums[i]));
        }
        
        int min = Integer.MAX_VALUE;
        for(int i : map.keySet()) {
            min = Math.min(min, map.get(i));
        }
        
        int ans = Integer.MIN_VALUE;
        for(int i : map.keySet()) {
            if(map.get(i) == min) {
                ans = Math.max(ans, i);
            }
        }
        
        return ans;
    }
}