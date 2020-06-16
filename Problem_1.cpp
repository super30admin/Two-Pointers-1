// Time Complexity : O(n), where n is the size of the array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size()==0){
            return ;
        }
        int low =0;
        int mid =0;
        int high =nums.size()-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums.at(high);
                nums.at(high) = nums.at(mid);
                nums.at(mid) = temp;
                high--;
            }
            else{
                int temp = nums.at(low);
                nums.at(low) = nums.at(mid);
                nums.at(mid) = temp;
                mid++; low++;
            }
        }
    }
};