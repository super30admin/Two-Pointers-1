// Time complexity is O(nlogn)(for sorting) + O(n^2) = O(n^2)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
  1. In each iteration of outer for loop, we keep the low pointer at fixed position
     and move the mid and high pointers to find 3 sums with sum = 0.
  2. If sum is equal to zero, we add the triplet to the 'res' vector and update
     mid and high pointers.
  3. We move the mid pointer to the right side till we find a number greater than nums[mid]
     or till mid >= high.
  4. We move the high pointer to the left side till we find a number less than nums[high]
     or till high <= mid.
  5. When the condition of for loop is low < nums.size()-2, then return 'res' when nums.size() < 3.
  6. When the condtion of for loop is low < nums.size(0, then we can return 'res' when nums.size() == 0.
*/

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size() < 3) return res;
        sort(nums.begin(), nums.end());
        for(int low = 0; low < nums.size()-2; low++) {
            if(low > 0 && nums[low] == nums[low-1]) continue;
            int mid = low+1;
            int high = nums.size()-1;
            while(mid < high) {
                int sum = nums[low] + nums[mid] + nums[high];
                if(sum == 0) {
                    vector<int> temp = {nums[low], nums[mid], nums[high]};
                    res.push_back(temp);
                    mid++;
                    high--;
                    while(mid < high && nums[mid] == nums[mid-1])
                        mid++;
                    while(mid < high && nums[high] == nums[high+1])
                        high--;
                }
                else if (sum < 0)
                    mid++;
                else
                    high--;
            }
        }
        return res;
    }
};
