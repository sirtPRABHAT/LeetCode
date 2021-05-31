class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >=0; i-- ){
            if(digits[i] < 9){
                digits[i] +=1;
                //don't use break retun statement breaks loop and return from function 
               // break;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        //deafult value of java array is zero
        int result[] = new int[digits.length +1];
            result[0] = 1;
        return result;
            
 
    
    }
}