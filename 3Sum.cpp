// Time Complexity :  O(n^2) where n = size of input 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Core Logic :- Sort array and reduce the problem to two sum.
 * Iterate over array index using 'i', and use the pointer low and high to check if sum = 0 is achievable by adding elements pointed by
 * i, low and mid pointers. If sum of these two pointers is greater than 0 then decrement high pointer, if it is less, then increment low pointer.
 * Handle duplicate amswers scenarios by skipping a duplicate elements.  
 */

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>> result;
        if (nums.size() == 0)
            return result;
        
        int n = nums.size();
        sort(nums.begin(), nums.end());
        
        for (int i = 0; i < n - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            
            if (nums[i] > 0)
            {
                break;
            }
            
            int low = i + 1;
            int high = n - 1;
            
            while (low < high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum == 0)
                {
                    result.push_back({nums[i], nums[low], nums[high]});
                    low++;
                    high--;
                    
                    while (low < high && nums[low] == nums[low - 1])
                    {
                        low++;
                    }
                    
                    while (low < high && nums[high] == nums[high + 1])
                    {
                        high--;
                    }
                }
                else if (sum < 0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return result;
    }
};