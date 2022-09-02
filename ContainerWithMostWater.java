// Time Complexity - O(n^2) for brute force and O(n) for 2 pointer approach
// Space Complexity - O(1) in both approach

public class ContainerWithMostWater {

    static class Solution {
        public int maxArea(int[] height) {
            // brute force approach -- will give time limit exceeded error
            int max = 0;
            int n = height.length;
            for (int i=0; i<n; i++){
                for (int j=i+1; j<n; j++) {
                    max = Math.max(max,Math.min(height[i],height[j]) * (j-i));
                }
            }
            return max;
        }
    }

    static class Solution2 {
        public int maxArea(int[] height) {
            // two pointer approach
            int max = 0;
            int n = height.length;
            int low=0;
            int high = n -1;

            while ( low < high ) {
                int currArea = Math.min( height[low], height[high] ) * (high-low);
                max = Math.max(max, currArea);
                if( height[low] <= height[high] ) low++;
                else high--;
            }
            return max;
        }
    }

}
