// Time Complexity : O(height.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        int currentArea = 0;

        while (r > l) {
            // calculate current area
            //            min because, we need to move next from min side
            currentArea = Math.min(height[l], height[r]) * (r - l);

            // compare both area
            max = Math.max(currentArea, max);

            // now move min pointer of the two (l or r)
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}