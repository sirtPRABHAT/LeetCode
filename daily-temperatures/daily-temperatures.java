class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        stack.push(0);
        for(int i=1; i < temperatures.length; i++){
            int g = i;
            if(!stack.empty()){
                int element = stack.pop();
                while(temperatures[element] < temperatures[g]){
                   // System.out.println("for element " + temperatures[element] +" nearst greator is "+ temperatures[g]);
                    res[element] = Math.abs(element-g);
                    if(stack.empty()){
                        break;
                    }
                    element = stack.pop();
                }
                if(temperatures[element] >= temperatures[g]){
                 stack.push(element);
                }
                 stack.push(g);
            }else {
                stack.push(g);
            }
        }
        return res;
    }     
    
}