// Time Complexity : O(n)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/container-with-most-water/

You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith 
line are (i, 0) and (i, height[i]).
*/

// Two pointer approach

class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxVal = 0;
        int left = 0;
        int right = height.size()-1;

        while(left < right){
            int area = (right-left) * min(height[left], height[right]);
            maxVal = max(maxVal, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxVal;
    }
};