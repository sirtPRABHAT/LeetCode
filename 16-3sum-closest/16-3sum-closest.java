class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        
        int difference = Integer.MAX_VALUE;
        if(nums.length == 3){
            sum = nums[0] + nums[1] + nums[2];
        }else{
            for(int i = 0; i<nums.length-2; i++){
                int l = i+1;
                int r = nums.length-1;
                while(l<r){
                    int s = nums[i] + nums[l] + nums[r];
                    if(s < target){
                        l++;
                    }else{
                        r--;
                    }
                    
                    if( Math.abs(s - target) < difference){
                        difference= Math.abs(s - target);
                        sum = s;
                    }
                }
            }
        }
        return sum;
    }
}