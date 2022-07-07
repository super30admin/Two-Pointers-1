//Time complexity- O(n)
//Space Complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public int maxArea(int[] height) {
     int max_area=0;
     int left=0;
     int right=height.length-1;
     
     while(left<right){
         max_area= Math.max(max_area, Math.min(height[left],height[right]) * (right-left));
         
         if(height[left]< height[right]){
             left++;
         }
         else right--;
}
     return max_area;
 }
}