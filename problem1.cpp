//Time Complexity - O(N)
//Space Complexity - O(1)
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int mid=0,high=nums.size()-1,low=0;
        while(mid<=high){
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
        }
    }
};