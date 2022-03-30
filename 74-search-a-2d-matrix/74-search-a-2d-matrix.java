class Solution {
    private boolean search(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;
        
        while(first <= last) {
            int mid = (first + last)/2;
            
            if(arr[mid] == target) {
                return true;
            }
            else if(arr[mid] < target) {
                first = mid + 1;
            }
            else
                last = mid - 1;
        }
        
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix) {
            if(search(arr, target)) {
                return true;
            }
            else
                continue;
        }
        return false;
    }
}