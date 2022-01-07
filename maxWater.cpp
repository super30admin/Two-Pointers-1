// Time Complexity : O(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


#include <algorithm>
class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int i=0;
        int j=height.size()-1;
        int max_val=-1;
        int res =0;
        
        while(i<j){
            if(height[i]<height[j]){
                res=height[i]*(j-i);
                i++;
            }else if(height[i]>=height[j]){
                res=height[j]*(j-i);
                j--;
            }  
            max_val = max(res,max_val);         
        }
        return max_val;
        
    }
};
