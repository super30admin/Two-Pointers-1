// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Approach - maintain left and right pointers. calculate volume at each step and compare with max. if left element is smaller increment left pointer else decrement right pointer
public class ContainerMostWater {

    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int currentWidth = right - left;

            int leftElement = height[left];
            int rightElement = height[right];

            int currentMin = Math.min(leftElement, rightElement);
            int currentVolume = currentMin * currentWidth;

            // compare current volume with max
            if(currentVolume > max) {
                max = currentVolume;
            }

            // if left element is smaller increment left pointer else decrement right pointer
            if(leftElement < rightElement) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }

        return max;

    }
    
}