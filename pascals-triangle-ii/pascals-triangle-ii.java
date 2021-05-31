class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>(rowIndex+1);
        List<Integer>  row1 = new ArrayList<Integer>();
        row1.add(1);
        result.add(row1);
        
        for(int i = 1; i <= rowIndex; i++){
             List<Integer>  row = new ArrayList<Integer>();
            for(int j = 0; j <=i; j++){
                if(j == 0 || j == i){
                    row.add(j, 1);
                    continue;
                }
             row.add(j,  (result.get(i-1)).get(j-1) +  result.get(i-1).get(j) );
            }
            result.add(row);
        }
         
     return  (result.get(rowIndex));
    }
    
}