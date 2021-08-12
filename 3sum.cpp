// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// iterate over each elemnt after sorting the whole array
// using each element as a pivot,use the two pointer to find 2 elemnts that sum up with the pivot and equates to zero
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        sort(nums.begin(),nums.end());
        // int low =0;
        // int high = nums.size()-1;
        vector<vector<int>> result;
        // edge case
        if(nums.size()< 3){
            return result;
        }
        for(int i=0;i<nums.size()-2;i++ ){
            // check for duplicates in the outer loop
                if(i>0 && nums[i]==nums[i-1]) continue;
            // run a two pointer for the two sum
            int low =i+1; int high = nums.size()-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum==0){
                    vector<int>temp={nums[i],nums[low],nums[high]};
                    result.push_back(temp);
                    low++;
                    high--;
                    while(low < high && nums[low]  == nums[low-1])low++;
                    while(low < high && nums[high] == nums[high+1])high--;
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
};