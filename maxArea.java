// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: yes
// Any problem you faced while coding this: took ref from lecture video

public class maxArea {

    public static int getMaxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;

        // null condition check
        if (height == null || height.length == 0)
            return 0;

        // lopping through height array
        while (left < right) {
            // Taking max from height * width
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            // moving left & right pointers based on value
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(getMaxArea(height));
    }
}
