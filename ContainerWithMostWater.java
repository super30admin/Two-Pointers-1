// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //base case
        if(height.length == 0) return 0;

        //Assign left pointer to the first element and right pointer to the last element and max as 0 initially
        int left = 0, right = height.length-1, max = 0;

        //move the pointers till left pointer crosses right pointer
        while(left<right){

            //calculate the area with most water by multiplying the min value of two heights and the width(right index - left index) between two heights.
            max = Math.max(max, Math.min(height[left], height[right]) * (right-left));

            //if left height is less, increment the left pointer to find the max left height
            if(height[left] < height[right]){
                left++;
            }  //if right height is less, decrement the right pointer to find the max right height
            else if(height[left] > height[right]) {
                right--;
            } // if left height is equal to right height, increment both the pointers as it will give the same result.
             // Incrementing either of the pointers is also fine as it will also give the same result.
            else {
                left++;
                right--;
            }
        }
        //return the max area
        return max;
    }
}