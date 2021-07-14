class Solution {
    public int search(int[] nums, int target) {
        
        int result = BS(nums, 0, nums.length -1, target);
        return result;
    }
    
    public int BS(int[] a, int si, int ei, int target){
        int mid = Math.abs(si+ei)/2;
        if(ei < si){
            return -1;
        }
        if(a[mid] == target){
            return mid;
        }
        int ri = -1;
        if(a[mid] <= target){
           ri =     BS(a,mid+1, ei, target );
        }else if(a[mid] > target){
          ri  = BS(a, si, mid-1, target);
            
        }
        return ri;
    }
    
    
}