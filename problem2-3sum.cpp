// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach: sort the vector and consider each element as pivot.linear search throghout the right of the pivot to find the pairs 

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) 
    {
        int n=nums.size();
        vector<vector<int>> temp;
        std::sort(nums.begin(),nums.end());
        if(n==0 || n<3)
        {
            
             return temp;
        }
        for(int i=0;i<n;i++)
        {
           //outside duplicate 
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=n-1;

            while (left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    vector<int> temp1={nums[i],nums[left],nums[right]};
                    temp.push_back(temp1);
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left]){left++;}
                    while(left<right && nums[right]==nums[right+1]){right--;}
                }
                else if(nums[i]+nums[left]+nums[right]<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
            
        }
        return temp; 
    }
};
