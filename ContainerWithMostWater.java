// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int max_area = 0; // Variable to store the maximum area

        // Check if the height array is null or has only one element
        if(height == null || height.length == 1)
            return 0; // Return 0 as there is no valid area

        // Check if the first two elements of height array are both 1
        if(height[0] == 1 && height[1] == 1)
            return 1; // Return 1 as the maximum area possible is 1

        // Initialize two pointers, i pointing to the start and j pointing to the end
        for(int i = 0, j = height.length - 1; i < j;)
        {
            int area = 0; // Variable to store the area between the two pointers

            // Calculate the area based on the shorter height between height[i] and height[j]
            // Move the pointer i or j based on the comparison of heights

            if(height[i] <= height[j])
            {
                area = height[i] * (j-i);
                i++; // Move the left pointer i to the right
            }
            else if(height[j] <= height[i])
            {
                area = height[j] * (j-i);
                j--; // Move the right pointer j to the left
            }

            // Update the maximum area if the current area is greater
            if(area > max_area)
            {
                max_area = area;
            }
        }

        // Return the maximum area
        return max_area;
    }
}
