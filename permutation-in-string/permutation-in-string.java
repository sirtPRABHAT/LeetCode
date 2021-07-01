class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int start = 0;
        int end = c1.length -1;
        

        while(end < c2.length){
             int[] target = new int[200];
            for(char ch: c1){
            target[(int)ch]++;
        }
            boolean localSum = total(c2,start, end, target);
            System.out.println(localSum);
            if(localSum) {
                return true;
            }
            else{
                
                start++;
                end++;
            }
        }
        
        return false;
    }
    
     public boolean total(char[] a, int start, int end, int[] target){
            for(int i = start; i <= end; i++){
                if(--target[(int)a[i]]  <0 ){
                    return false;
                }
            }
            return true;
        }
}