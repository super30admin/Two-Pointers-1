package S30.exercises;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

//Approach: Use two pointers (start, end of the array) to compare the heights and use a variable to store maxArea.
// Calculate the current  area by taking minimum of both pointers, and calculate width by subtracting the left pointer from
//right pointer and apply rectangular area formula.  Find the max area and update maxArea. Compare the values of both
//pointers and move increment/decrement accordingly.  Return the maxArea.

public class ContianerWithMostWater {
    public int maxArea(int[] height) {
        int leftPtr = 0;
        int rightPtr = height.length-1;
        int maxArea = 0;
        while(leftPtr < rightPtr){
            int area = Math.min(height[leftPtr], height[rightPtr]) * (rightPtr - leftPtr);
            maxArea = Math.max(maxArea,area );
            if(height[leftPtr] < height[rightPtr] ){
                leftPtr++;
            }else{
                rightPtr--;
            }
        }
        return maxArea;
    }

}
