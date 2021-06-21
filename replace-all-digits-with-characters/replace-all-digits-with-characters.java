class Solution {
    public String replaceDigits(String s) {
       
        char[] a = s.toCharArray();
        for(int i=1; i < a.length; i+=2){
            if(i%2 !=0){
                System.out.println(a[i]);
                a[i] = shift(a[i-1], a[i]-'0');
            }
        }
         return new String(a);
    }
   
     public char shift(char a, int l) {
        return (char)(a +l);
       
    }
}