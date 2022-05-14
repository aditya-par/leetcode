class Solution {
    public int findClosestNumber(int[] nums) {
        int min  = Integer.MAX_VALUE;
        int closest = 0;
        
        for(int n : nums) {
            if(min > Math.abs(n)) {
                min = Math.abs(n);
                closest = n;
            }
            else if(Math.abs(n) == min && closest < n) {
                closest = n;
            }
        }
        
        return closest;
    }
}