// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: Brute force - Nested iterations which will be O(n^2)
// USing 2 pointer approach we can reduce time complexity to O(n)
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int low =  0;
        int high = n-1;
        int result =0;

        while(low < high) {
            int width = high - low;

            int area =0;

            if(height[low] < height[high]) {
                area = width * height[low];
                low++;
            }else {
                area = width * height[high];
                high--;

                if(result < area) {
                    result = area;
                }
            }
            result  = Math.max(result, area);
        }


        return result;
    }
}