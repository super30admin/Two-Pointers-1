Time Complexity-O(n*n)
Space Complexity-O(1)
Did the Code run on Leetcode? yes

#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int i;
        vector<vector<int>>m;
        if(nums.size()==0)
        {
            return m;
        }
        int n=nums.size();
        sort(nums.begin(),nums.end());
        for(i=0;i<n-2;i++)
        {
            if(i==0 || nums[i]>nums[i-1])
            {
                if(nums[i]>0)
                {
                    break;
                }
                int low=i+1;
                int high=nums.size()-1;
                int sum=0-nums[i];
                while(low<high)
                {
                    if(nums[low]+nums[high]==sum)
                    {      
                        vector<int>k;
                        k.push_back(nums[i]);
                        k.push_back(nums[low]);
                        k.push_back(nums[high]);
                        m.push_back(k);
                        while(low<high && nums[low]==nums[low+1])
                        {   
                            low++;
                        }
                        while(low<high && nums[high]==nums[high-1])
                        {
                             high--;
                        }
                        low++;
                        high--;
                    }
                    else if(sum>nums[low]+nums[high])
                    {
                        low++;
                    }
                    else
                    {
                        high--;
                    }
                }
            }
            
        }
        return m;
    }
};

int main() {
	vector<int>nums={-1,0,1,2,-1,-4};
	Solution soln;
	vector<vector<int>>result=soln.threeSum(nums);
	for(int i=0;i<result.size();i++)
	{
	    for(int j=0;j<result[0].size();j++)
	    {
	        cout<<result[i][j]<<" ";
	    }
	    cout<<"\n";
	}
	return 0;
}