public class Container_with_most_water {

    // Time: O(n), Space: O(1)
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length-1;

        while (left < right) {
            int breadth = right - left;
            int area = breadth * (Math.min(height[left], height[right]));

            if (area > maxArea) maxArea = area;
            else {
                if (height[left] < height[right]) left++;
                else right--;
            }
        }
        return maxArea;
    }
}