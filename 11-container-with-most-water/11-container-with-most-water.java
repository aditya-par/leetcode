class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_water = Integer.MIN_VALUE;
        
        while(i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]); 
            
            max_water = Math.max(max_water, h * w);
            
            if(height[i] < height[j]) {
                i++;
            }
            else
                j--;
        }
        
        return max_water;
    }
}