class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int n = s.length;
        int j = n - 1;
        while(i < n/2) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            
            i++;
            j--;
        }
    }
}