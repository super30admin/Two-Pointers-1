/*

// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

not storing repeated values.

// Your code here along with comments explaining your approach
Multiple approach 
1. Nested iteration - O(N^3)
2. Sort and then use binary search - O(n^2logn)
3. Sort and then use two pointer for two sum - O(n^2)

*/



#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> arr;
        int n = nums.size();
        sort(nums.begin(),nums.end());
        for (int i{};i<n-2;++i){
            // if the value repeats then move ahead. cause already sorted will find the same combinations.
            if(i>0 and nums.at(i) == nums.at(i-1)){
                continue;
            }
            int low = i+1;
            int high = n-1;
            cout<<"gg"<<endl;
            while(low<high){
                // since sorted ahead numbers might repeat so avoid similar combinations
                if(low>i+1 && nums.at(low) == nums.at(low-1)){
                    low++;
                    continue;
                }
                //since sorted going back numbers might repeat so avoid similar combinations
                if(high<n-1 && nums.at(high) == nums.at(high+1)){
                    high--;
                    continue;
                }
                // if equal push answer
                int target = nums.at(i) + nums.at(low) +nums.at(high);
                if(target == 0){
                    vector<int> arr_temp{nums.at(i),nums.at(low),nums.at(high)};
                    arr.push_back(arr_temp);
                    low++;
                    high--;
                }
                // if high move high pointer
                else if(target>0){
                    high--;
                }
                // if low move low pointer
                else if(target<0){
                    low++;
                }
            }
        }
        return arr;
    }
};