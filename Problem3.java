public class Problem3 {
    //Time Complexity O(n)
// Space Complexity O(1)
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int target = 0;
        while (left < right) {
            int sum;
            if (height[left] < height[right]) {
                sum = height[left] * (right - left);
                left++;
            } else {
                sum = height[right] * (right - left);
                right--;
            }
            target = Math.max(target, sum);
        }
        return target;
    }
}
