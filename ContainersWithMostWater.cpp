// Time Complexity : O(N) where N=Number of elements in an array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Two pointer technique

class Solution {
public:
    int maxArea(vector<int>& height) {
        int low=0,high=height.size()-1;
        int maxArea = 0,curr=0;
        
        while(low<=high)
        {
            curr = (high-low) * min(height[low],height[high]);
            maxArea = max(curr,maxArea);
            if(height[high] < height[low]){
                high--;
            }
            else
                low++;
        }
        return maxArea;
        
    }
};
