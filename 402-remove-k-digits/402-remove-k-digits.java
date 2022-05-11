class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack();
        
        for(int i = 0 ; i < num.length() ; i++) {
            while(k > 0 && !stk.isEmpty() && num.charAt(i) < stk.peek()) {
                stk.pop();
                k--;
            }
            
            stk.push(num.charAt(i));
        }
        
        while(k > 0) {
            stk.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(! stk.isEmpty()) {
            sb.append(stk.pop());
        }
        
        sb.reverse();
        
        while(sb.toString().startsWith("0")) {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}