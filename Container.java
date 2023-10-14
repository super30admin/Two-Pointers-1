// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {

       int n= height.length;
       int l= 0;
       int r= n-1;
       int max = Integer.MIN_VALUE;

// logic to check the maximum water volume  by finding minimum of heights at l and r and multiplying it with the difference of index.

       while(l<r) {

           max = Math.max(max, Math.min(height[l],height[r]) *(r-l));
//finding the maximun volume possibility and moving pointers accordingly
           if(height[l]<height[r]){

               l++;
           } else{
               r--;
           }

        }
        
      return max;  
    }
}