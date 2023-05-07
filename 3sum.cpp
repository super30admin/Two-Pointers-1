// Time Complexity :O(NlogN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
// Approach is sorting the nums and then for each element in nums searching for pairs whose 
sum equals zero in the rest of array with pointers low and high , if we 
find the triplet inserting it into ans ,To handle duplicate triplets we are
 checking with previous elements of every pointer i.e., i ,low,high and moving accordingly
 
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
// Approach is sorting the nums and then for each element in nums searching for pairs whose 
sum equals zero in the rest of array with pointers low and high , if we 
find the triplet inserting it into ans ,To handle duplicate triplets we are
 checking with previous elements of every pointer i.e., i ,low,high and moving accordingly
        int i=0;
        vector<vector<int>>a;
        sort(nums.begin(),nums.end());
        while(i<nums.size()-1)
        {
            // Below code is for handling the duplicate triplets
            if(i!=0 && nums[i]==nums[i-1])
            {
                
                i++;
                continue;
            }

            // up to here
            int low=i+1;
            int high=nums.size()-1;
           

            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    a.push_back({nums[i],nums[low],nums[high]});
                    low++;
                    high--;
                    // Below code is for handling the duplicate triplets
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1])
                    {
                        high--;
                    }
                    // up to here
                }
                else if(sum<0)
                {
                    low++;
                }
                else
                {
                    high--;
                }

            }
            i++;
        }
        return a;
    }
};