// Time Complexity : O(n), go through each value in height array to determine max area
// Space Complexity : O(1), no additional space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach :
// Brute force - Do nested iteration, find the pair of heights, that have max area.
// Keep two pointer, one in the start and one in the end, calculate the area by
// the height x the width which is
// min(front, rear) x (rear-front).
// Whichever pointer has more height, keep it as it and move the other pointer. There is a chance we can find a pointer
// with much larger height, so the new area formed by existing pointer and pointer to new max height will have a larger area.
public class ContainersWithMostWater {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;

        int front = 0;
        int rear = height.length -1;
        int maxArea = 0;
        while(front < rear){
            // Find the area, min(p1,p2) * width (p2-p1)
            int area = Math.min(height[front], height[rear]) * (rear-front);
            maxArea = Math.max(maxArea, area);

            // Move pointer with smaller height by 1
            if(height[front] < height[rear]){
                front += 1;
            }else{
                rear -= 1;
            }

        }
        return maxArea;
    }
}
