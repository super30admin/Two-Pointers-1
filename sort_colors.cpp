// Time : O(n)
// Space: o(1)

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int mid = 0; // collecting all 1s
        int low = 0; // collecting all 0s
        int high = nums.size() -1; // collecting all 2s

        while(mid <= high)
        {
            if(nums[mid] == 2)
            {
                swap(nums[mid], nums[high]);
                high--;
            }
            else if(nums[mid] == 0)
            {
                swap(nums[mid], nums[low]);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
        
    }
};