//Time complexity: O(N)
//Space complexity:O(1)
class Solution {
    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;

        int l = 0;
        int r = height.length - 1;
        int currArea;
        while (l < r) {

            if (height[l] < height[r]) {
                currArea = height[l] * (r - l);
                l++;
            }

            else {
                currArea = height[r] * (r - l);
                r--;
            }

            maxArea = Math.max(maxArea, currArea);

        }

        return maxArea;

    }

}