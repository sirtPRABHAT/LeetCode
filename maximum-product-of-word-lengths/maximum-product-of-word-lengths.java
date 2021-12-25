class Solution {
    public int maxProduct(String[] words) {
        int r=0;
        for(int i=0;i< words.length-1; i++){
            for(int j=i+1; j < words.length; j++){
                if((words[i].length() * words[j].length()) > r){
                    
                    if(isDiffer(words[i], words[j])){
                        r = words[i].length() * words[j].length();
                    }
                    
                }
             
            }
        }
        return r;
    }
    
    public boolean isDiffer(String first, String second) {
        for(char c: first.toCharArray()){
            for(char c2: second.toCharArray()){
                if(c2==c){
                    return false;
                }
            }
        }
        return true;
    }
}