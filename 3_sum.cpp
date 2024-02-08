//TC: O(n*n)
//SC: O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> temp;
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());
        int i,j,k;
        int sum;
        for(i=0;i<nums.size();i++)
        {
            j=i+1;
            k=nums.size()-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    temp.insert({nums[i],nums[j],nums[k]});
                    j++;
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                k--;

            }

        }
        
        for(auto i:temp)
        {
            result.push_back(i);
        }
        return result;
    }
};