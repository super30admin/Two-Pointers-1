
// Time Complexity : O(n) where n is number of elements
// Space Complexity : O(1) we are not using extra space
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


#include<vector>
#include<bits/stdc++.h>
#include<stdlib.h>
#include<cmath>
#include<time.h>
#include<iostream>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        if(nums.empty()) return;
        int low=0;
        int mid=0;
        int high=nums.size()-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums[high],nums[mid]);
                high--;
            }
        }
        
        
        
        
    }
};

int main(){
    Solution a;
    vector<int>  nums={0,0,1,1,1,1,2};
    //int target=5;
    a.sortColors(nums);
    for (int x : nums) 
         cout << x << " "; 

    cout<<endl;

    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    // cout <<  boolalpha << b << endl;

}