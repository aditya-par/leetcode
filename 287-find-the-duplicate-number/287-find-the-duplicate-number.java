class Solution {
    public int findDuplicate(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];
        int temp = 0;
        while(temp < size) {
            arr[temp] = 0;
            temp++;
        }
        for(int i = 0; i < size; i++) {
            arr[nums[i]]++;
            if(arr[nums[i]] == 2) return nums[i];
        }
        return 0;
    }
}