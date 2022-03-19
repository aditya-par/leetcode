class Solution {
    public String removeDuplicateLetters(String s) {
        int lastIndex[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        boolean visited[] = new boolean[26];
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = ch - 'a';
            
            if(visited[value]) continue;
            
            while(! stack.empty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i) {
                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }
            stack.push(ch);
            visited[value] = true;
        }
        
        StringBuilder ans = new StringBuilder();
        for(char i : stack) {
            ans.append(i);
        }
        
        return ans.toString();
     }
}