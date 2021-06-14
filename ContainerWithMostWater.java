package TwoPointers1;

/*
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