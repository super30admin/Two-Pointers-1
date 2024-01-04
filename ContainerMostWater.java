/*
* Approach:
*  1. Brute Force: O(n^2)
        take first loop for start of container,
            and another loop for end of container
* 
*  2. Better: Two pointer
        Initially, start and end are at two ends.
            move close to each other.

        area = width(distance between two pointers) * 
                    min(height[start], height[end])
* 
*  3. As two pointers move opposite side, width will decrease.
        max area is directly proportional to min of heights.
    
    Therefore, to get max area, move pointers towards max heights.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/
public class ContainerMostWater {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;

        int maxArea = Integer.MIN_VALUE;

        while (start < end) {
            int currArea = Math.min(height[start], height[end]) * (end - start);

            maxArea = Integer.max(maxArea, currArea);

            if (height[start] < height[end])
                start++;
            else
                end--;
        }

        return maxArea;
    }
}