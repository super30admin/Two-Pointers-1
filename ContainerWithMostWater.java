//https://leetcode.com/problems/container-with-most-water/
/*
Time: O(n) where n = heights.length
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int a = 0;
        int b = height.length - 1;
        int max = 0;

        while (a < b) {

            if (height[a] < height[b]) {
                max = Math.max(max, height[a] * (b - a));
                a++;
            } else {
                max = Math.max(max, height[b] * (b - a));
                b--;
            }

        }
        return max;
    }

}
