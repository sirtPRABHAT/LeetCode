class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[nums.length];
        int f= 0;
        int l = n;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 ==0){
                a[i] = nums[f];
                f++;
            }else{
                a[i] = nums[l];
                l++;
            }
        }
        
        return a;
        
    }
}