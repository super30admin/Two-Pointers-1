/*
* Time complexity: O(n)
Space complexity: O(1)

Two pointer approach is used and he aim to go for more height after comparing 2 in the hand
if both the heights are equal we can go in either direction as we are covering all possibilities
*/
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int low = 0, high = height.length - 1;

        while(low <= high) {
            max = Math.max(max, (high - low) * Math.min(height[low], height[high]));

            if(height[low] <= height[high]) {
                low ++;
            } else {
                high--;
            }
        }

        return max;
    }
}