class Solution {
    public int removeElement(int[] nums, int val) {
         int result = 0;
        for(int i =0; i <nums.length; i++){
            if(nums[i] == val){
                result +=1;
            }
        }
        for(int i =0; i <nums.length; i++){
            if(nums[i] == val){
               
               for(int j = i; j< nums.length; j++){
                   if(nums[j] != val){
                       int temp = nums[i];
                       nums[i]=nums[j];
                       nums[j] = temp;
                       break;
                   }
               }  
                
            }
        }
        return nums.length -result;
    }
}

//Better approach
// public int removeElement(int[] nums, int val) {
//     int i = 0;
//     for (int j = 0; j < nums.length; j++) {
//         if (nums[j] != val) {
//             nums[i] = nums[j];
//             i++;
//         }
//     }
//     return i;
// }