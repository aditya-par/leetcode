class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = delete(s);
        return s1.equals(delete(t));
    }
    
    public String delete(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '#') {
                stk.push(ch);
            }
            else if(! stk.empty()) {
                stk.pop();
            }
        }
        String str = "";
        while(! stk.empty()) {
            str = stk.pop() + str;
        }
        
        return str;
    }
}