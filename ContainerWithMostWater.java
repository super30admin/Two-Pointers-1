public class ContainerWithMostWater {
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : getting started

// Your code here along with comments explaining your approach

    class Solution {
        public int maxArea(int[] height) {
            //base case
            if(height == null || height.length == 0) return 0;
            if(height.length == 1) return height[0];

            //brute force
            /*int max = Integer.MIN_VALUE;

            for (int i = 0; i < height.length; i++) {
                for (int j = i+1; j < height.length; j++) {
                    int min = Math.min(height[i], height[j]);

                    max = Math.max(max, min * (j - i));

                }
            }
            return max;*/

            int max = Integer.MIN_VALUE;
            int left = 0, right = height.length-1;

            //compute max value  and move towards the center
            while(left < right){
                int min = Math.min(height[left], height[right]);
                max = Math.max(max, min * (right -left));

                if(height[left] < height[right]){
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
}
