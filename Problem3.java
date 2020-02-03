/* Container with most water - Maximum Area */

/* Optimised approach-Two pointers  */
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//in two pointers approach, we will consider low and high pointers
//and we keep incrementing low and decrementing high to find maximum area between both
//so in this case, only linear traversal occurs.

class Solution {
   public int maxArea(int[] height) {
       int max = 0;
       int low = 0;
       int high = height.length - 1;
       while (low < high){
           int currentArea = 0;
           if(height[low] < height [high]){
               currentArea = height[low] * (high - low);
               low++;
           } else {
               currentArea = height[high] * (high - low);
               high--;
           }
           max = Math.max(max, currentArea);
       }
      return max;
   }
}


/*Brute force 
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//in brute force, we will consider all the combinations of heights 
//and store maximum are we can get out of those combinations

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, currentArea);
           }
       }
       return max;
    }
}

*/