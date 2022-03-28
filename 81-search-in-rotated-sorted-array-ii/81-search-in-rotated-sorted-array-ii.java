class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high) {
            while (low < high && nums[low] == nums[low + 1])
                ++low;
            while (low < high && nums[high] == nums[high - 1])
                --high;
            int mid = (low+high)/2;
            
            // case 1 if target is at mid
            if (nums[mid] == target) {
                return true;
            }
            
            // if left side is sorted
            else if (nums[low]<=nums[mid]) {
                if (target >= nums[low] && target<=nums[mid]) {
                    high = mid -1 ;
                }
                else
                    low = mid +1;
            }
            
            // if right side is sorted
            else {
                if(target >= nums[mid] && target<=nums[high]) {
                    low = mid + 1;
                }
                else
                    high = mid - 1;
            }
            
        }
        return false;
    }
}