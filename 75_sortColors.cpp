// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0){
            return;
        }
        int low = 0, high = nums.size()-1, mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else{
                mid++;
            }
        }
    }
    void swap(vector<int>& nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
};
