// Time Complexity : O(n)
// Space Complexity : O(1), No auxillary Space Needed
// Did this code successfully run on Leetcode : Yes, it successfully ran on Leetcode.
// Tried myself in C++. Didn't discuss in class till now.

//Code

class Solution {
public:
    int maxArea(vector<int>& height) {
        int netarea,area=0;
        int j=0,k=height.size()-1;
        
        while(j<k){
            netarea = min(height[j],height[k]) * (k-j);
            area = max(area,netarea);
            
            if(height[j]<height[k]){
                j++;
            }
            else
                k--;
        }
        return area;
    }
};