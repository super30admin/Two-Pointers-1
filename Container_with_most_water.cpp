/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

class Solution {
public:
    int maxArea(vector<int>& height) {
        int ans = 0;
        int len = height.size();
        int l = 0, r = len - 1;
        while(l<=r){
            int h = r-l, w = min(height[l],height[r]);
            if(h*w < ans){
                if(height[l]==w){
                    l++;
                } else{
                    r--;
                }
            } else if(h*w > ans){
                ans = h*w;
                if(height[l]==w){
                    l++;
                } else{
                    r--;
                }
            } else{
                l++;
            }
        }
        return ans;
    }
};