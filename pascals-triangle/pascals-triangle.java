class Solution {
    public List<List<Integer>> generate(int numRows) {
        
         List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
          List<Integer>  row1 = new ArrayList<Integer>();
        row1.add(1);
        result.add(row1);
        
        for(int i = 1; i < numRows; i++){
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
        

        return result;
        
        
    }
        
    
}