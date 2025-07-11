//Time Complexity (TC):We use a single while loop with two pointers moving towards each other, so the time complexity is O(n).
//Space Complexity (SC): Only a constant number of variables are used, so the space complexity is O(1).

//Use two pointers (`leftPointer` and `rightPointer`) at both ends of the array to represent container boundaries.
//Calculate the area formed by the shorter line and the distance between pointers, updating the maximum area found.
//Move the pointer with the shorter height inward to try and find a taller line that may yield a larger area.


class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;

        int leftPointer = 0, rightPointer = length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int currentHeight = 0;
            int width = rightPointer - leftPointer;

            if (heights[leftPointer] < heights[rightPointer]) {
                currentHeight = heights[leftPointer];
                leftPointer++;
            } else {
                currentHeight = heights[rightPointer];
                rightPointer--;
            }

            maxArea = Math.max(maxArea, currentHeight * width);
        }

        return maxArea;
    }
}
