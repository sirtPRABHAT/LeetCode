class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Integer> set = new HashSet<>();
        for(int a: sentence.toCharArray()){
            set.add(a);
        }
       boolean result = set.size() >=26 ? true: false;
        return result;
       
    }
}

//SET JUST STORES VALUE (WITH NO DUPLICATION)