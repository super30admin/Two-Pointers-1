//Time Complexity = O(N*N*N)
//Space Complexity = O(N) approximately
//Where N is the size of the vector nums.
//here the time limit will exceed.
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int i,j,k;
        sort(nums.begin(),nums.end());
        set <vector<int>> ans1;
        for(i=0;i<nums.size()-2;i++)
        {
            for(j=i+1;j<nums.size()-1;j++)
            {
                for(k=j+1;k<nums.size();k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        vector <int> temp{nums[i],nums[j],nums[k]};
                        ans1.insert(temp);
                    }
                }
            }
        }
        vector<vector<int>> ans;
        for(auto i : ans1)
            ans.push_back(i);
        return ans;
    }
};


//Time Complexity = O(N*N)
//Space Complexity = O(1)
//Where N is the size of the vector nums.
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int i,n=nums.size();
        vector <vector<int>> ans;
        if(n<3)
            return ans;
        sort(nums.begin(),nums.end());
        for(i=0;i<n;i++)
        {
            if(nums[i]>0) break;                                                        //Since nums is sorted when element greater than 0 is encountered at ith index there is no way we can get sum of three element equal to 0.
            if(i!=0 && nums[i]==nums[i-1])  continue;                                   //here we are incrementing the ith index,if element at i-1th index and ith index is same. 
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    vector<int> temp{nums[i],nums[j],nums[k]};
                    ans.push_back(temp);
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]) j++;                               //here we are incrementing the jth index,if element at j-1th index and jth index is same.
                    while(j<k && nums[k+1]==nums[k]) k--;                               //here we are decrementing the kth index,if element at k+1th index and kth index is same.
                }
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
};
