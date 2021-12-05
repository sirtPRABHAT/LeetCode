class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
         vector<int> finalVector, midVector;
        sort(nums1.begin(), nums1.end());
        midVector.push_back(nums1.at(0));
        for(auto it = nums1.begin()+1; it != nums1.end(); it++){
           if(*it != *(it-1)) {
               midVector.push_back(*it);
           }
        }
        
        for(auto it : midVector){
           if(isPresent(nums2, it)) {
               finalVector.push_back(it);
           }
        }
        return finalVector;
    }
    
    bool isPresent(vector<int> vec, int val){
        bool result = false;
        for(auto x: vec){
            if(x == val){
                result = true;
                break;
            }
        }
        return result;
    }
};