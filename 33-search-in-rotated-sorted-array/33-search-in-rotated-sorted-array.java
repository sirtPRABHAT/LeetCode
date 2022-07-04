class Solution {
    
    public int binarySearch(int[] a, int low, int high, int target){
        
        if(low>high){
            return -1;
        }
        
        int mid = (low + high)/2;
        
        if(target == a[mid]){
            return mid;
        }
        
        if(target < a[mid]){
            return binarySearch(a, low, mid-1, target);
        }else{
            return binarySearch(a, mid+1, high, target);
        }
        
    }
    
    public int findPivot(int[] a, int low, int high){
        
        if(low>high){
            return -1;
        }
        
        int mid = (low + high)/2;
        
        if(mid > low && a[mid] < a[mid-1]){
            return mid-1;
        }
        if(mid < high && a[mid]> a[mid+1]){
            return mid;
        }
        
        if(a[mid] < a[low]){
           
            return findPivot(a, low, mid-1);
        }else{
             return findPivot(a, mid+1, high);
        } 
    }
    
    
    
    
    public int search(int[] nums, int target) {
        int p = findPivot(nums, 0, nums.length-1);
       // System.out.println(p);
        if(p==-1) return binarySearch(nums, 0, nums.length-1, target);;
        if(nums[p] == target) return p;
        if(target < nums[0]){
          return  binarySearch(nums, p+1, nums.length-1, target);
        }else{
          return  binarySearch(nums, 0, p-1, target);
        }
       
    }
}




