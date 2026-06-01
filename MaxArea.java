//Time Complexity : O(n)
//Space Complexity : O(1)

public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
