// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/* APPROACH:
Using the two pointers approach: leftPointer and rightPointer
set leftPointer to 0 and end rightPointer to array length - 1
As we want maximum area, we would keep a local maxima area and global maxima maxArea.
Value of area = (rightPointer - leftPointer)*Min(heights at both pointers) == (breadth)*(height)
maxArea would be updated to max of itself and the new calculated area
1. height at rightPointer > height at leftPointer, leftPointer++ , to find a higher height value
2. else if height at rightPointer <= height at leftPointer, rightPointer++ , to find a higher height value
*/

import java.util.Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int leftPointer = 0, rightPointer = height.length - 1;
        int maxArea = 0;
        while(leftPointer < rightPointer){
            maxArea = Math.max(maxArea, (Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer)));
            if(height[leftPointer] <= height[rightPointer]){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;

        // Brute force
        /* int maxArea = 0;
        for(int i=0; i<height.length; i++){
            for(int j=0; j<height.length; j++){
                maxArea = Math.max(maxArea, (Math.min(height[i], height[j]) * (j-i)));
            }
        }
        return maxArea; */
    }

    public static void main(String[] args){
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height1)); //49

        int[] height2 = {1,1};
        System.out.println(maxArea(height2)); //1
    }
}
