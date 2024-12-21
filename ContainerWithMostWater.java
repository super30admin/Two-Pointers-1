/*
    Leetcode problem 11: Container With Most Water
    T.C: O(n) :: S.C: O(1)

    Solved using two pointers solution: Left and Right pointers are placed at either
    ends of the array respectively. Calculate the area between the heights of these
    two pointers (i.e. min of two heights * diff. of their indices). Compare the area
    with the max variable and store the result in max. Return the result in the end.
*/

class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        if (height == null || height.length == 0) return max;

        int n = height.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            
            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}