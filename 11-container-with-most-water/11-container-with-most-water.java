class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int b = j-i;
            if(max < b * Math.min(height[i], height[j])){
                max = b * Math.min(height[i], height[j]);
            }
            if(height[i] == Math.max(height[i], height[j])){
                j--;
            }else{
                i++;
            }
        }
        
        return max;
    }
}