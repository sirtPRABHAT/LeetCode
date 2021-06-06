class Solution {
    public int[] minOperations(String box) {
       int boxes[] = new int[box.length()];
        for(int i = 0; i < box.length(); i++) {
            boxes[i] = Integer.parseInt(String.valueOf(box.charAt(i)));
            //System.out.println(box.charAt(i));
        }
        List<Integer> scan = new ArrayList<Integer>();
        for(int i = 0; i < boxes.length; i++){
            if(boxes[i] ==1)
                scan.add(i);
        }
        int result[] = new int[boxes.length];
        for(int i = 0; i < boxes.length; i ++){
            int d = 0;
            for(int j = 0; j < scan.size(); j ++){
                 d += Math.abs(scan.get(j)-i);
            }
            result[i] = d;
        }
          return result;  
        
    }
}