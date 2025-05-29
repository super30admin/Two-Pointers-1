#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>ans;
        int n = nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0) 
                break;
            int low = i+1,high = n-1;
            while(low<high){
                int Csum = nums[i]+nums[low]+nums[high];
                if(Csum == 0){
                    vector<int>temp={nums[i],nums[low],nums[high]};
                    ans.push_back(temp);
                    low++;
                    high--;
                    while(low < high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(Csum>0)
                    high--;
                else
                    low++;

            }
        }
        return ans;
        
    }
};