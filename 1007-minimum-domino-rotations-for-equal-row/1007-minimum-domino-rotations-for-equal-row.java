class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int countSum[] = new int[7];
        int countA[] = new int[7];
        int countB[] = new int[7];
        
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] == bottoms[i]) {
                countSum[tops[i]]++;
            }
            else {
                countSum[tops[i]]++;
                countSum[bottoms[i]]++;
                countA[tops[i]]++;
                countB[bottoms[i]]++;
            }
        }
        
       for(int i = 1; i <= 6; i++) {
            if(countSum[i] == tops.length) 
                return Math.min(countA[i], countB[i]);
        }
        return -1;
    }
}