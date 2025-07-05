/* 11. Container With Most Water 
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104*/

/*
Time Complexity:-O(n)
Space Complexity:-O(1)
Approach:-We aim to find two lines in the height[] array that, along with the x-axis, form a container that holds the most water.
Start with pointers at both ends (left = 0, right = n - 1).
Calculate the area between them:
area = (right - left) * min(height[left], height[right])
Move the pointer with the smaller height, since moving the taller one won’t improve the area.
Track the maximum area found during the process.*/

class MaxArea {
    public int maxArea(int[] height) {
        // Edge case: if fewer than 2 lines, no container can be formed
        if (height == null || height.length < 2) {
            return 0;
        }
        int n = height.length;
        int left = 0, right = n - 1; // two pointers at the ends
        int max = 0; // stores the maximum area
        // Loop until the pointers meet
        while (left < right) {
            // Calculate current area and update max area if needed
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {// Move the shorter wall inward to try for a better area
                left++;// move left pointer rightward
            } else {
                right--;// move right pointer leftward
            }
        }
        return max;// return the maximum area found

    }
}