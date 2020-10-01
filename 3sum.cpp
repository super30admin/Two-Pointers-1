// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        if (nums.size()<3) return answer; // if the size is less than 3 then there cannot be 3 numbers
        sort(nums.begin(),nums.end()); //sort the array
        
        for (int i=0;i<=nums.size()-2;i++) {
            if(i>0 && nums[i]==nums[i-1])
                    continue;
           int left=i+1,right=nums.size()-1; 
            while (left<right) {
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0) { //sum equal to 0 , bullseye
                    vector<int> v={nums[i],nums[left],nums[right]};
                    answer.push_back(v);
                    left++;
                    right--;
                    
                    while (left<right && nums[left]==nums[left-1]) //to handle the duplicates
                        left++;
                    while (left<right && nums[right]==nums[right+1]) //to handle the duplicates
                        right--;
                } else if (sum<0) { //sum is less than 0 so increment the left pointer as we want more sum
                    left++;
                } else if (sum>0) { //sum is greater than 0 so we decrement the right pointer as we want less sum
                    right--;
                }
            }
        }
        return answer;
    }
};