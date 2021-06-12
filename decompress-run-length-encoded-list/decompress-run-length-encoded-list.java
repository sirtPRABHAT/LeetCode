class Solution {
    public int[] decompressRLElist(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i <= nums.length; i+=2){
            for(int j =1; j<= nums[i-1]; j++){
                list.add(nums[i]);
            }
        }
        int[] arr = list.stream().mapToInt(i->i).toArray();

        return  arr;
    }
}