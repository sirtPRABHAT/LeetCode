class Solution {
    public void rotate(int[] nums, int k) {
     k = k%nums.length;
        // for(int i  = 1; i <= k; i++){
        //     rotateOnce(nums);
        // }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
         reverse(nums, k,  nums.length-1);
        
    }
    
     public void rotateOnce(int[] nums) {
       int temp = nums[nums.length - 1];
        
         for(int i  = nums.length-1; i >0; i--){
             nums[i] = nums[i-1];
         }
          nums[0] =temp;
    }
    
     public void reverse(int[] nums , int s, int e) {
       
         for(int i = s, j = e; i<j; i++,j--){
             int temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
         }
    }
}