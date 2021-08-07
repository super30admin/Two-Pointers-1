// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.empty() || height.size() == 0){
            return 0;
        }
        int low = 0, Max=0;
        int high = height.size()-1;
        while(low<high){
            Max = max(Max, min(height[low], height[high]) * (high-low));
            if(height[low] <= height[high])
                low++;
            else
                high--;
        }
        return Max;
    }
};
