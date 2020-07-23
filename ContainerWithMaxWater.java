/**
Problem: Container with max water
Time Complexity : O(n), where n is the length of the height array
Space complexity : O(1), as we don't make use of any additional space.

Did the code run on LeetCode: Yes

Approach: 2 pointers
1. We use two pointers, low pointing to the first element and high to the last element.
2. The area(container with max water) between two lines is nothing but the max product of the minimum of the two heights and the distance between them.
3. We update the pointers accordingly, if the height of the first pointer is bigger than that of the second, 
we decrement the second pointer, otherwise we increment the first one, because we need to maximize the area.
*/


class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high) {
            maxArea = Math.max(maxArea, (Math.min(height[low],height[high]) * (high-low)));
            if(height[low] > height[high]) {
                high--;
            }
            else  {
                low++;
            }
            
        }
        return maxArea;
    }
}