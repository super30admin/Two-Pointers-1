package TwoPointers1;

/*S30 Big N Problem #36 {Medium} - https://www.youtube.com/watch?v=BBvzdJastJQ

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, 
such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example:

Input: [1,8,6,2,5,4,8,3,7]

Output: 49
Source Link: https://leetcode.com/problems/container-with-most-water/
    -------------------------------------------------------------------------------------------------------
    Time complexity : o(n) 
    space complexity: o(1) 
    Did this code run successfully in leetcode : yes
    problems faces : no*/
    
public class ContainerWithMostWater {
    
 public int maxArea(int[] height) {
     if(height == null || height.length == 0) return 0;
     
     int max= 0;
     int left = 0;
     int right= height.length-1;
     while(left<right)
     {
         max= Math.max(max, (right-left) * Math.min(height[left], height[right]));
         if(height[left] < height[right])
         {
             left++;
         } else {
             right--;
         }
     }
        
     return max;
    }

}
