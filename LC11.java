// TC: O(n)
// SC: O(1)

public class LC11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int ans = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}