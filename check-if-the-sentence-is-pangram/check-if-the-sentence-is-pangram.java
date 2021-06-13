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


    
//BETTER SOLUTION

//FOR EACH IDENTICAL CHAR ADD ONE TO TOTAL
//WHY ch-a ---> to bring the aasci value between 0-26 so that it can fix in int array of size 26
    // int cnt[] = new int[26], total = 0;
    // for (var ch: sentence.toCharArray())
    //     if (++cnt[ch - 'a'] == 1)
    //         total++;
    // return total == 26; 
    // }
