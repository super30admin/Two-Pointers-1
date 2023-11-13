// Time complexity : O(n)
// Space complexity : O(1)
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = maxArea(height);
        System.out.println(result);
    }

    private static int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int curr = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, curr);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;

    }
}