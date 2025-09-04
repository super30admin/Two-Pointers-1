// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// The idea behind this problem is to convert the 3Sum problem to a 2Sum problem, by fixing the first element of a triplet in the outer loop.
// After sorting the array, the inner loop will run 2Sum on the rest of the array to find the pair of elements which sum upto the target sum
// We avoid duplicate triplets in the outer loop by ignoring the same elements, same logic in the inner 2Sum loop

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<vector<int>> result;
        for(int i=0; i<n-2; i++) {
            if(i !=0 && nums[i] == nums[i-1]) continue; // to avoid duplicates
            if(nums[i] > 0) break; // no more valid triplets can be formed
            int targetSum = 0 - nums[i];
            int low = i + 1; int high = n - 1;
            while(low < high) { // twoSum loop
                int sum = nums[low] + nums[high];
                if(sum == targetSum) {
                    vector<int> triplet = {nums[i], nums[low], nums[high]};
                    result.push_back(triplet);
                    low++;
                    high--;
                    // avoid duplicates
                    while(low < high && nums[low] == nums[low-1]){ low++; }
                    while(low < high && nums[high] == nums[high+1]) { high--; }
                } else if (sum > targetSum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
};