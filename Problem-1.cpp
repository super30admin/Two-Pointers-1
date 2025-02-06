// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use 3 pointers to store 0,1, and 2.
// If the current element is 0, swap it with the low. If it is 2, then swap it with high, else just continue.


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int low=0, high = n-1;
        int i=0; 
        while(i<=high){
            if(nums[i] == 0){
                swap(nums[low], nums[i]);
                low++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                swap(nums[i], nums[high]);
                high--;
            }
        }

    }
};