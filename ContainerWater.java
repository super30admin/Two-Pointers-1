// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class ContainerWater {
    public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        // Traverse all the possible left and right heights.
        while (l < r) {
            // Compute the area for the current left and right heights.
            // If the current area is greater than previous max area, then update the max area to the current area.
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));

            // Now we try to maximize the area generated.
            // Since the lower height is the constraining factor to generate the max area, we move away from that height to the next height. 
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{4,3,2,1,4}));
        System.out.println(maxArea(new int[]{1,2,1}));
    }
}
