// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// using two pointer approach. start at first and last indices, update ans accordingly.

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.empty() || height.size()<2){
            return 0;
        }
        int ans = 0;
        int p1 = 0, p2 = height.size()-1;
        while(p1<p2)
        {
            ans = max(ans,(p2 - p1)* min(height[p1],height[p2]));
            if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        return ans;
    }
};