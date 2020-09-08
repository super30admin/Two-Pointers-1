// Time Complexity : O(n) where n is the number of elements in the array, since we look at the array just once
// Space Complexity : O(1) since we use constant space.
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// we use two ptrs left and right 
//  the area is (diff in position of the two ptrs) multiplied by the  minimum of the length.
// so for each l and r we see who has the lesser value and decrement/increment that ptr and move accordingly.
// if both have same value use any of them

class Solution {
    // we can use dp as well

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l < r) {
            area = Math.max(area, (r - l) * Math.min(height[r], height[l]));
            if (height[r] > height[l]) {
                l++;
            } else if (height[r] == height[l])
                l++;
            else {
                r--;
            }
        }

        return area;

    }
}