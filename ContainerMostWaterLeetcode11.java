//Time Complexity: O(n)
//Space Complexity: O(1)
//Leetcode: Yes
public class ContainerMostWaterLeetcode11 {
        public int maxArea(int[] height) {
            int max = 0;
            if (height == null) {
                return max;
            }
            int left = 0;
            int right = height.length -1;

            while (left <= right) {
                int w = right - left;
                max = Math.max(max, Math.min(height[left], height[right]) * w);
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
}
