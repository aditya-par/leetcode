class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> resultList = new ArrayList<>();
        int[] lastIndex = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        int i = 0;
        while(i < s.length()) {
            int range = lastIndex[s.charAt(i) - 'a'];
            for(int j = i; j <= range; j++) {
                range = Math.max(range, lastIndex[s.charAt(j) - 'a']);
            }
            resultList.add(range - i + 1);
            i = range + 1;
        }
        
        return resultList; 
    }
}