// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public int maxArea(int[] height) {
    if(height == null || height.length == 0) return 0;
       
       int max =0; // using this function to store the maximum area
       int left=0; // left pointer
       int right = height.length-1; // right pointer
       
       while(left<right){ // iterating the array thru 2 pointers
           //selecting maximum area and then selecting minimum height out of the 2 elements and calculating the area
           max = Math.max(max,Math.min(height[left],height[right])*(right-left));
           if(height[left] < height[right]){
               left++;
           }else{
               right--;
           }
       }
       
       return max;
   }