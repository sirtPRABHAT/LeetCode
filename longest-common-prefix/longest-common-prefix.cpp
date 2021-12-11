class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string common = strs[0];
        string str2;
        
        for(int i=1; i <strs.size(); i++){
            str2 = strs[i];
            common = commonString(common, str2);
        }
        return common;
    }
    
    
    string commonString(string st1, string st2){
        string res ="";
        for(int i=0,j=0; i<st1.size() || j< st2.size(); i++,j++){
            if(st1[i] ==st2[j]){
                res.push_back(st1[i]);
            }else{
                break;
            }
        }
        return res;
    }
};