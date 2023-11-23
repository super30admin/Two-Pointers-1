// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class Problem3 {

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                int curr = height[i] * (j - i);
                max = Math.max(max, curr);
                i++;
            } else if (height[i] > height[j]) {
                int curr = height[j] * (j - i);
                max = Math.max(max, curr);
                j--;
            } else {
                int curr = height[j] * (j - i);
                max = Math.max(max, curr);
                i++;
                j--;
            }
        }
        return max;
    }

    public static void main(String[] arg) {
        int[] nums = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = maxArea(nums);

        System.out.println(result);

    }

}
