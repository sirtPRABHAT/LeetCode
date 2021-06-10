class Solution {
    public int maximumWealth(int[][] accounts) {
        int t =0;
        for(int i=0; i < accounts.length; i++){
            int c = 0;
            for(int j=0; j < accounts[i].length; j++){
                c+= accounts[i][j];
            }
            if(c > t) t = c;
            
        }
        return t;
    }
}