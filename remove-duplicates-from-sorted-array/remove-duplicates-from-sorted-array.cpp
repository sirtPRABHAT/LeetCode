class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        int d = 0;
        for(int j =1; j <  nums.size(); j++){
            if(nums[i] == nums[j]){
                d ++;
            }else{
                nums[i+1] = nums[j];
                i++;
            }
        }
        return  nums.size() -d;
    }
};