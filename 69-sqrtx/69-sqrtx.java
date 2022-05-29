class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long last = x;
        long ans = 0;
        
        while(start <= last) {
            long mid = start + (last - start) / 2;
            
            if(mid * mid  <= x) {
                ans = mid;
                start = mid + 1;
            }
            else
                last = mid - 1;
        }
        
        return (int)ans;
    }
}