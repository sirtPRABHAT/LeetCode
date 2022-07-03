class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        if(nums.length == 3){
            int sum = nums[0] + nums[1] + nums[2];
            if(sum == 0){
                List<Integer> temp = new ArrayList<>();
                        temp.add(nums[0]);
                        temp.add(nums[1]);
                        temp.add(nums[2]);
                        res.add(temp);
            }
        }else{
            for(int i = 0; i<nums.length-2; i++){
                int l = i+1;
                int r = nums.length-1;
                while(l<r){
                    int s = nums[i] + nums[l] + nums[r];
                    if(s == 0){
                       List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        res.add(temp);
                        //break;
                    }
                   int d = s-0;
                    if(d < 0){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>(res);
        return ans;
    }
        
    
}