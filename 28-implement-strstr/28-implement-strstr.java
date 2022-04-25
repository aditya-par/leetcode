class Solution {
    public int strStr(String haystack, String needle) {
        int s1 = haystack.length();
        int s2 = needle.length();
        
        if(s2 == 0)
            return 0;
        
        if(s2 > s1)
            return -1;
        
        for(int i = 0 ; i <= s1-s2; i++) {
            String str = haystack.substring(i , i + s2);
            if(str.equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}