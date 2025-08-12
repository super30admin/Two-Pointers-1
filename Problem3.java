/*
Time Complexity:-O(n)
Space Complexity:-O(1)
Approach:-We aim to find two lines in the height[] array that, along with the x-axis, form a container that holds the most water.
Start with pointers at both ends (left = 0, right = n - 1). Calculate the area between them: area = (right - left) * min(height[left], height[right])
Move the pointer with the smaller height, since moving the taller one won’t improve the area. Track the maximum area found during the process.*/

class Problem3 {
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