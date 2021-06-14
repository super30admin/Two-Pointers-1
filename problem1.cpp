// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach: take 3 pointers to collect each 0's 1's and 2's respectively  and swap and collect while each pointers traverse the array

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right)
        {
            if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                std::swap(nums[mid],nums[right]);
                right--;
            }
            else 
            {
                std::swap(nums[mid],nums[left]);
                left++;
                mid++;
            }
        }
    }
};
