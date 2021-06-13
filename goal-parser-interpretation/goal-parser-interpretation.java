class Solution {
    public String interpret(String command) {
        String result ="";
        char[] c = command.toCharArray();
        
        for(int i=0; i < c.length; i++){
            if(c[i] == 'G'){
                result = result.concat("G");
            }else if((c[i]+""+c[i+1]).equals("()")){
                result = result.concat("o");
                i++;
            }else{
                result = result.concat("al");
                System.out.println(i);
                i += 3;
                System.out.println(i);
            }
                
            
        }
        return result;
    }
}