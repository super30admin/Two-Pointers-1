//lomuto partition,
//I can also use pigeonhole sort for same purpose, but this works in same number of passes

//O(n) is TC
//O(1) is SC
class Solution {
public:
    //simple route
    void sortColors(vector<int>& nums) {
       int i=-1;
       for(int j=0;j<nums.size();++j){
           if(nums[j]==0){
               swap(nums[++i],nums[j]);
           }
       }
        int count =i;
        for(int k=0;k<nums.size();++k){
           if(nums[k]==1){
               swap(nums[++count],nums[k]);
           }
       }
    }
};