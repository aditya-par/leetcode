class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s) {
            stk.push(ch);
        }
        
        int i = 0; 
        while(! stk.isEmpty()) {
            s[i] = stk.pop();
            i++;
        }
    }
}