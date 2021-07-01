class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int layer = 0;
        for(layer = 0; layer < n/2; layer++){
           
            int first = layer;
            int last = (n-1)- layer;
            for(int i = first; i < last; i++){
                 int offset = i-first; //without this handles 3x3 but requires for larger
                //storing top
                int top = matrix[first][i];
                
                //shift left to top (top = left)
                matrix[first][i] = matrix[last - offset][first];
                
                 //shift left to top (left = bottom)
                matrix[last-offset][first] = matrix[last][last-offset];
                
                 //shift left to top (bottom = right)
                matrix[last][last-offset] = matrix[i][last];
                
                 //shift left to top (right = top)
                matrix[i][last] = top;  
                
            }
        }
    }
}