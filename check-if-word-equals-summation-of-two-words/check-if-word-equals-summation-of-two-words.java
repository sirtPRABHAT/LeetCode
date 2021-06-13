class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String f ="";
        for(int a: firstWord.toCharArray()){
          f=  f.concat(String.valueOf(a-'a'));
        }
        String s ="";
        for(int a: secondWord.toCharArray()){
           s= s.concat(String.valueOf(a-'a'));
            
        }
        
        String t ="";
        for(int a: targetWord.toCharArray()){
           t= t.concat(String.valueOf(a-'a'));
        }
        
        boolean result = Integer.valueOf(f) + Integer.valueOf(s) ==  Integer.valueOf(t) ? true: false;
        return result;
    }
}