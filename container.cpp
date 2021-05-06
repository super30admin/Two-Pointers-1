// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0,right = height.size()-1,res= 0;
        while(left<right){
            res = max(res,(right-left)*min(height[left],height[right]));
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    }
};