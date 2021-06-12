class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = -1;
        switch (ruleKey){
                case "type":
                    key = 0;
                break;
                case "color":
                    key = 1;
                break;
                default:
                    key =2;
                break;
        }
        
        int result =0;
        for(int i=0; i< items.size(); i++){
            if(items.get(i).get(key).equals(ruleValue) ){
                result++;
            }
        }
            
        return result;

    }
}