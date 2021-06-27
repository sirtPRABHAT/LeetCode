class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] a1 = text1.toCharArray();
        char[] a2 = text2.toCharArray();
        int l1 = a1.length;
        int l2 = a2.length;
        
        int[][] lcs  = new int[l1+1][l2+1];
        
        for(int i = l1-1; i >= 0; i-- ){
             for(int j = l2-1; j >= 0; j-- ){
                 lcs[i][j]= lcs[i+1][j+1];
                 
                 if(a1[i]==a2[j]){
                     lcs[i][j]++;
                 }
                 
                 if(lcs[i][j+1]> lcs[i][j]){
                     lcs[i][j] = lcs[i][j+1];
                 }
                 
                 if(lcs[i+1][j]> lcs[i][j]){
                     lcs[i][j] = lcs[i+1][j];
                 }
             }
        }
        return lcs[0][0];
    }
}