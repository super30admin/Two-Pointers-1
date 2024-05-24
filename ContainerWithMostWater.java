/**
Approach 1: Nested Iteration: O(N^2), SC = O(1)

Approcah 2: Two Pointers: Find max area and move lower value pointers.
TC -O(n), SC - O(1)
 */

 class Solution {
    //Two Pointer Approach
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(low<high){
            int minH = Math.min(height[low],height[high]);
            int area = minH * (high-low);
            max_area = Math.max(max_area, area);

            while(height[low] <= minH && low<high){
                low++;
            } 
            while(height[high] <= minH && low<high){
                high --;
            } 
        }
        return max_area;

    }
    //Brute Force : Nested Operation
    public int maxArea1(int[] height) {
        int max_area = Integer.MIN_VALUE;

        for(int i = 0; i< height.length-1;i++){
            for(int j =1;j<height.length;j++){
                int minHeight = Math.min(height[j], height[i]);
                int area = minHeight * (j-i);

                max_area = Math.max(max_area, area);
            }
        }
        return max_area;
    }
}