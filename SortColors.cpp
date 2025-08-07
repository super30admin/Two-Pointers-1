#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Keep three variables l for all the 0s mid for all 1s and r for all 2s
and l should not cross mid and mid should not cross r
the array will be sorted
*/
class Solution{
public:
    void sortColors(vector<int>& nums) {
        int l=0,mid=0,r=nums.size()-1;
        while(mid<=r){
            if(nums[mid]==2){
                swap(nums[mid],nums[r]);
                r--;
            }
            else if(nums[mid]==0){
                swap(nums[mid], nums[l]);
                mid++;
                l++; 
            }else {
                mid++;
            }
        }
    }
};
