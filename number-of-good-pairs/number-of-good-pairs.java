class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        public int numIdenticalPairs(int[] nums) {
        int[] a =  new int[101];
        int result =0;
        for(int n : nums){
            result += a[n];
            a[n] = a[n]+1;
        }
        return result;
        
        
    }
        
    }
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         for(int i=0; i < nums.length; i++){
//             if(map.get(nums[i]) == null){
//                 map.put(nums[i], 1);
//             }else{
//                  map.put(nums[i], map.get(nums[i])+1);
//             }   
//         }
        
//          int result =0;
        
        
//         Iterator hmIterator = map.entrySet().iterator();
//         while (hmIterator.hasNext()) {
//             Map.Entry mapElement = (Map.Entry)hmIterator.next();
//             int marks = ((int)mapElement.getValue());
//             System.out.print(marks);
//             if(marks > 2){
//                 result += p(marks);
//             }else if(marks ==2){
//                 result +=1;
//             }
            
//         }
       
//         return result;

    
//     public int p(int n){
//         int p = 0;
//         p = fac(n) / (fac(2)*fac(n-2));
//         return p;  
//     }
    
//     public int fac(int n){
//         int f = n;
//         for (int i = n - 1; i >= 1; i--){
//             f = f * i;
//         }
//         return f;
//     }
//}
