// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Idea here is to fix one element and then use two pointers to see if sum is 0. We avoid duplicate
// entries by sorting the array initialy and skipping same elements when we are iterating with two
// pointers as well as fixed element.

#include<vector>

class Solution {
public:
    std::vector<std::vector<int>> threeSum(std::vector<int>& nums) {
        // sort the array
        std::sort(nums.begin(), nums.end());
        int n = nums.size();
        std::vector<std::vector<int>> result;

        for(int i = 0; i < n-2; i++)
        {
            // if the first element is > 0 then we cant have sum as 0
            if(nums[i] > 0)
            {
                break;
            }
            // to avoid outer duplicacy
            if(i != 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            // take left pointer as first element after the ith element; take right pointer as last element
            int l = i+1;
            int r = n-1;
            while(l<r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                // if sum is 0 we found triplet, push it to result
                if(sum == 0)
                {
                    result.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;
                    // to avoid inner duplicacy.
                    while(l < r && nums[l] == nums[l-1])
                    {
                        l++;
                    }
                    // to aovid inner duplicacy
                    while(l < r && nums[r] == nums[r+1])
                    {
                        r--;
                    }
                }
                //if sum is less than 0, which means we have to move towards right for bigger elements.
                else if(sum < 0)
                {
                    l++;
                }
                else // sum > 0 implies we want smaller elements and we have to move towards left.
                {
                    r--;
                }
            }
        }
        return result;
    }
};