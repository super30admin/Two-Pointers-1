#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Sort the array so we can use two pointers efficiently.
For each number, fix it and look for two other numbers using low and high pointers.
Skip duplicates to avoid repeating the same triplet in the result.
*/
class Solution{
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());

        for(int i=0;i<nums.size();i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int j=i+1, k=nums.size()-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }else if(total<0){
                    j++;
                }else{
                    result.push_back({nums[i], nums[j], nums[k]});
                    j++;

                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }

                }
            }
        }
        return result;
    }
};
