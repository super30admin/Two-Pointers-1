// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size()==0){
            return 0;
        }
        int low = 0, high = height.size()-1;
        int maxi = INT_MIN;
        while(low<high){
            maxi = max(maxi, min(height[low], height[high])*(high-low));
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxi;
    }
};
