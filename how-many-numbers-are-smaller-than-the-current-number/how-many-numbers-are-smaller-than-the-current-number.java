class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = nums.clone();
         Arrays.sort(sortedArray);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++ ){
           // map.put(c[i], i);
            map.putIfAbsent(sortedArray[i], i);
        }
        int[] result = new int[nums.length];
       
        for(int i =0; i < nums.length; i++){
            if(i ==0) {
              result[i] = Math.abs(map.get(nums[i]) - 0) ;
            }else{
                result[i] =  Math.abs(map.get(nums[i]) - 0);
            }
        }
        return result;
    }
}