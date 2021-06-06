class Solution {
    public int[] minOperations(String box) {
        List<Integer> scan = new ArrayList<Integer>();
        for(int i = 0; i < box.length(); i++) {
            if(box.charAt(i) == '1')
                scan.add(i);
        }
        
        int result[] = new int[box.length()];
        for(int i = 0; i < box.length(); i++){
            int d = 0;
            for(int j = 0; j < scan.size(); j ++){
                 d += Math.abs(scan.get(j)-i);
            }
            result[i] = d;
        }
          return result;  
        
    }
}
