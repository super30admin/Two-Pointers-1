// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int first = 0;
        int last = nums.size()-1;
        int curr = 0;
        while(curr <= last){
            if(nums[curr] == 0)
                swap(nums[curr++],nums[first++]);
            else if(nums[curr] == 2)
                swap(nums[curr],nums[last--]);
            else
                curr++;
        }
    }
};