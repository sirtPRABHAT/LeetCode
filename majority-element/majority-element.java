class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }    
        } 
        int mx=0;
        int vx=0;
    for (int i = 0; i< nums.length; i++) 
    {                
        if(map.get(nums[i]) > vx)
        {
             vx = map.get(nums[i]);
            mx = nums[i];          
        }
    }
        return mx;
    }
}