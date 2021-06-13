// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int len = height.size();
        int low = 0;
        int high = len-1;
        
        int max_area = INT_MIN;
        int temp_area;
        
        while(low < high)
        {
            temp_area = min(height[low], height[high]) * (high - low);
            
            if(temp_area > max_area)
                max_area = temp_area;
            
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        
        return max_area;
    }
};