class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        //int maxSoFar = Integer.MIN_VALUE;
        //because lowest altitude is 0
        int maxSoFar = 0 ;
        for(int i=0; i < gain.length; i++){
             curr += gain[i];
            if(curr > maxSoFar){
                maxSoFar = curr;
            }
        }
        return maxSoFar;
    }
}