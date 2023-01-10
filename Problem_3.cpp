
11. Container With Most Water
-------------------------------

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.


// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :



class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int l = 0, h = n-1;
        int area = 0, result = 0;
        while (l<h) {
                                // height  * width          
            area = min(height[l], height[h]) * (h - l);
            result = max(result, area);

            if (height.at(l) <= height.at(h) ) {
                l++;
            } else {
                h--;
            }
        }
        return result;
    }
};

