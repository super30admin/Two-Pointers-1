// Time Complexity : O(N) where N is the size of the array
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/container-with-most-water/
// Submission Link: https://leetcode.com/submissions/detail/468962030/

class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int max = 0, area = 0;
        
        while(left != right){
            area = min(height[left], height[right]) * (right - left);
            if(area > max)
                max = area;
            if(height[left] <= height[right])
                left++;
            else
                right--;
        }
        return max;
    }
};