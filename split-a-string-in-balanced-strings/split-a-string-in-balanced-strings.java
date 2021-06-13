class Solution {
    public int balancedStringSplit(String s) {
        int cnt =0; int res=0;
        char[] c = s.toCharArray();
       for(int i=0; i < c.length; i++){
           cnt += c[i] == 'R' ? 1: -1;
           if(cnt == 0){
               res++;
           } 
       }
        return res;
    }
}