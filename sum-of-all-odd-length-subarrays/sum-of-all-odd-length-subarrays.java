class Solution {
    public int sumOddLengthSubarrays(int[] arr) { 
        int res =0;
        int end = 0;
        while( end < arr.length){
            res += fun(arr, 0, end);
            end +=2;
        }     
        return res;
    }
    
      public  int fun(int[] arr, int s, int e) {
            int sum =0;
            while(e < arr.length){
                for(int i=s;i<= e; i++){
                    if(e == arr.length ){
                     break;
                    }
                 sum += arr[i]; 
                }
                e++;
                s++;  
            }
       
          return sum;
        }
}