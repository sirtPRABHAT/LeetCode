class Solution {
    public int[][] diagonalSort(int[][] mat) {
     //APPROACH TAKE ALL DIAGONALS VALUE, SORT IT AND THEN PLACE IT
    int m = mat.length, n = mat[0].length;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < (i>0?1:n); j++) {
            Stack<Integer> vals = new Stack<>();
            while (i<m && j<n){
                vals.add(mat[i++][j++]);
            }   
            Collections.sort(vals);
            while (i > 0 && j > 0){
                mat[--i][--j] = vals.pop();
            }      
        }
    }
    return mat;
}
    
}