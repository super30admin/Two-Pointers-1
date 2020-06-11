// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    int maxArea(vector<int>& height) {
        int low=0;
        int high = height.size()-1;
        int max=0;
        for(int i=0; i<height.size()-1; i++){
            int min = height[low];
            if(height[high]<min)
                min= height[high];
            int area = min*(high-low);
            if(area>max) max=area;
            
            if(height[low]<height[high]) low++;
            else                         high--;
            
        }
        
        return max;
    }
};
