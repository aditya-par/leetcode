class Solution {
    public void nextPermutation(int[] nums) {
        // step 1 finding index 1
        int a = 0;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                a = i;
                break;
            }
        }
        // step 2 finding index 2
        int b = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > nums[a]) {
                b = i;
                break;
            }
        }
        
        // if no arrangement possible just sort
        if(a == b) {
            Arrays.sort(nums);
            return;
        }
        // swap
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        // reverse after a index
        int start = a+1;
        int end = nums.length-1;
        while(start < end) {
            int val = nums[start];
            nums[start] = nums[end];
            nums[end] = val;
            start++;
            end--;
        }
    }
}