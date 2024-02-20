// 11. Container With Most Water
// Time Complexity : O(n)
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Two pointer approach:
initialized two pointers, low and high, at the beginning and end of the array respectively.
Then, iteratively calculates the area formed by the shorter vertical line at the current 
positions of the pointers and updates the maximum area found so far. and moves the pointers 
towards each other, selecting the next pair of lines that could potentially form a larger 
area, until the two pointer are equal, ensuring all possible combinations are explored.

*/

int maxArea(vector<int>& height) {
    int n = height.size();
    int low = 0, high = n-1, area = 0;
    while(low<high)
    {
        area = max(area, (min(height[low],height[high])*(high-low)));
        if(height[low] <= height[high])
            low++;
        else
            high--;
    }
    return area;
}
