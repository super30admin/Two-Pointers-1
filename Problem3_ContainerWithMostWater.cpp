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
    int maxArea(vector<int>& height) {
        
        if(height.empty()) return 0;
        
        int low=0;
        int high=height.size()-1;
        int gmax=INT_MIN;
        // int area;
        
        while(low<high){
            gmax=max(min(height[high],height[low]) * (high-low),gmax);
            // gmax=max(gmax,area); 
            if(height[high]>height[low]){
                low++;
            }else{
                high--;
            }
            
                
        }
        return gmax;
        
    }
};

int main(){
    Solution a;
    vector<int>  nums={1,8,6,2,5,4,8,3,7};
    //int target=5;
    int b = a.maxArea(nums);
    // for (int x : nums) 
    //      cout << x << " "; 

    // cout<<endl;

    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    cout <<  boolalpha << b << endl;

}