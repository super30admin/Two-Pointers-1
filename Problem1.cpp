// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    void swap(vector<int>& nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    void sortColors(vector<int>& nums) {
        int low=0;
        int high=nums.size()-1;
        int mid = 0;
        
        //sort colors wrt mid
        //mid index has 1s, low has 0s and high has 2s
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,low, mid);
                low++;mid++;
            }
            
            else if(nums[mid]==2){
                swap(nums,high, mid);
                high--;
            }
        }
    }
};
