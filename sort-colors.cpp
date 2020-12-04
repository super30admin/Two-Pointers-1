class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size()==0 || nums.size()==1) return;
        int sz = nums.size();
        
        int idx0 = 0;
        int idx2 = nums.size()-1;
        int run = 0;
        
        while(run<=idx2){
            if(nums[run] == 0){
                swap(nums[run],nums[idx0]);
                idx0++;run++;
            }else if(nums[run] == 2){
                swap(nums[run],nums[idx2]);
                idx2--;
            }else{
                run++;
            }
        }
        return;
        
    }
};