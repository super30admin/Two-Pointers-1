// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size()==0){
            return;
        }
        int low = 0, mid = 0, high = nums.size()-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(high, mid, nums);
                high--;
            }
        }
    }
    
    void swap(int i, int j, vector<int>& nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};
