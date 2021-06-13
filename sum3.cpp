
/* leetcode 3 sum problem 
Idea here is to use Two pointers approach - with sorting
I sorted array before which takes O(nlogn) and then putting pivot at 0 and low running from pivot+1
High pointer runs backwards. for every pivot check the sum of the triplet equals 0, less than 0 or greater than 0
if sum ==0 add  the triplet to result and increase low, decrease high - here checked duplicacy with low and high
if sum >0 decrease high, if sum<0 increase low */
//Time complexity: O(n*n)
//Space complexity: O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        
       int n=nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++)
        {
             
            if(i!=0 and nums[i]==nums[i-1]) continue;
            int low=i+1;
             int high=n-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
               
                if(sum==0)
                {
                     vector<int> triplet={nums[i], nums[low], nums[high]};
                    res.push_back(triplet);
                    low++;
                    high--;
                    while(low<high and nums[low]==nums[low-1]) low++;
                    while(low<high and nums[high]==nums[high+1]) high--;
                }
                else if(sum>0)
                {
                    high--;
                }
                else
                {
                    low++;
                }
                 
            }
            
           
        }
        return res;
    }
};
