class Solution {
    public int maxArea(int[] height) {
        int n = height.length -1;
        int front = 0;
        int rear = n;
        int maxArea = 0;
        while(rear > front){
            if(height[front] < height[rear]){
                int ca = height[front] * (rear-front);
                if(ca > maxArea){
                    maxArea = ca;
                }
                front++;
            }else{
                 int ca = height[rear] * (rear-front);
                if(ca > maxArea){
                    maxArea = ca;
                }
                rear--;
            }
        }
        
       return maxArea;
        
    }
}