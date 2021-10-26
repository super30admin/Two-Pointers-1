//Time Complexity = O(N)
//Space Complexity = O(1)
//where N is the size of the vector nums.

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int first=0, last=nums.size()-1, mid=0;
        while(mid<=last)
        {
            if(nums[mid]==0)
            {
                swap(nums[first],nums[mid]);
                mid++;
                first++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                swap(nums[last],nums[mid]);
                last--;
            }
        }
    }
};
