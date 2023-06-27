package prog_11_containerWithMostWater;

public class Solution {
    /*
    In this problem they have given, containers and we have to find the maximum amount of container water can store
    In order to do that we have calculate the width between containers and get Multiply it with the min value of container
    For eg :
    height = [1,8,6,2,5,4,8,3,7]
              0 1 2 3 4 5 6 7 8
              total water store between container 1 and container 6 is (index 2 - index 1) = 2 * Min(1,6) = 2
         we have to find the maximum value between all the containers.

Brute Force Approach:
We can perform Nested Iteration and keep finding possible iteration with every value like 1 -> 8, 1 -> 6 .......
and at the end we wil get the maximum among all combinations.

Time Complexity: O(n^2)

Two Pointer method :

In this method, we will maintain the left and right pointer. we have to calculate the value.
If value between 2 containers is maximum then we will keep it as maximum value.
If left pointer's height is less than or equal to right pointer height then we will move left pointer
If right pointer's height is less then we will move right pointer.
We have to both the pointers till it crosses.

Time complexity: O(N)
Space complexity: O(1)

     */
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length -1 ;
        int maxResult = 0;

        while(left < right){
            int width = right - left;
            int min = 0 ;
            min =  Math.min(height[left] , height[right]);
            int maxHeight = min * width ;
            if(maxHeight > maxResult){
                maxResult = maxHeight ;
            }

            if(height[left] <= height[right]){
                left ++ ;
            }
            else{
                right -- ;
            }

        }
        return maxResult ;
    }
}