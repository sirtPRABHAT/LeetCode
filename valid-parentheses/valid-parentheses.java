class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean res = true;
        char[] a = s.toCharArray();
        for(char c : a){
            if(openClose(c) == 1){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && stack.peek() == opposite(c) ){
                    stack.pop();
                }else{
                    res = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty()){
            res = false;
        }
        
        return res;
    }
    
     public int openClose(char s) {
        if(s == '(' || s == '[' || s == '{'){
            return 1;
        }else{
            return -1;
        }
    }
     public int opposite(char s) {
        if(s == ')'){
            return '(';
        }else if(s == ']'){
             return '[';
        }else {
             return '{';
        }
     }
}