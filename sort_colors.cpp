//Time O(n)
//Space O(1)
//Leetcode Yes
//issue seen : none
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i = 0, k = 0;
        int j = nums.size()-1;
        
        while(k <= j){
            if(nums[k] == 0){
                swap(nums[i],nums[k]);
                i++;
                k++;
            } else if(nums[k]== 1){
                k++;
            } else if(nums[k] == 2){
                swap(nums[k], nums[j]);
                j--;
            }

        }
       
    }
};
