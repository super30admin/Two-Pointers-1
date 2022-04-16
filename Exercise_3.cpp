// Time Complexity                              :  O(n)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/container-with-most-water/submissions/
class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        if(n == 0) return 0;
        int L = 0, R = height.size()-1,mx = 0;
        while(L <= R) {
            mx = max(mx, min(height[L],height[R])*(R-L));
            // whichever height is smaller, move the corresponding pointer
            // since we are decreasing the width between the 2 pointers and hence we should be increasing the height. 
            if(height[L] > height[R]) {
                R--;
            } else {
                L++;
            }  
        }
        return mx;
        // brute force
        int mx2 = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n-1;j++){
                int w = min(height[i],height[j])*(j-i);
                mx2 = max(mx2, w);
            }
        }
        
        // return mx2;
    }
};