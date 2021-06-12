class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int result = start;
        for(int i=1; i < n; i++){
            arr[i]  = start + 2*i;
            result = result ^ arr[i]; 
        }
        return result;
    }
}

//O(n) TIME COMPLEXITY BUT
//IT CAN ALSO SOLVE IN O(1) TIME COMPLEXITY