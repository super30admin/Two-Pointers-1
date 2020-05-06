package com.ds.rani.twopointers;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate
 * (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains
 * the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 * Example:
 * Input: [1,8,6,2,5,4,8,3,7] Output: 49
 */

//Approach: two pointer approach
//left pointer points to left element,right pointer points to right element, then find area.
// if height[left]<height[right] then increment left pointer else decrement right pointer
public class ContainerWithMostWater {

    //Time complexity:o(n) where n is number of elements in array
    //Space complexity:o(1)
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            //calculate area
            int area = Math.min( height[left], height[right] ) * (right - left);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println( ContainerWithMostWater.maxArea( arr ) );
    }
}
