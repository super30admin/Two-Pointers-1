// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - Use two pointers, one at the start and one at the end. At each step, calculate the area based on the shorter of the two lines and update the max area if it is larger. Then move the pointer (start or end) corresponding to the shorter line inwards, and repeat until they meet.

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //2 pointer solution
        int start = 0, end = height.length-1;
        int area;
        int maxarea = 0;

        while(start < end) {    //loop till start less than end
            area = Math.min(height[start], height[end]) * (end - start);    //calculate area
            if(maxarea < area) {    //update maxarea if greater area found
                maxarea = area;
            }
            //increment start or decrement end if smaller
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solver = new ContainerWithMostWater();

        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area for example 1: " + solver.maxArea(heights1));

        int[] heights2 = {1, 1};
        System.out.println("Max area for example 2: " + solver.maxArea(heights2));
    }
}
