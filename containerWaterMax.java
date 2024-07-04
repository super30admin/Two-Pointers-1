/*
        We can use a 2 pointer approach here
        formula is min(height[i],height[j]) * j-i will be the total area of the water since it is a rectange (l*b)
        Tc --> O(n)
        Sc --> O(1)

 */
class Solution {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_area = Integer.MIN_VALUE;
        while (i < j) {
            int min_h = Math.min(height[i], height[j]);
            int area = min_h * (j - i);
            max_area = Math.max(max_area, area);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }//while

        return max_area;

    }
}
