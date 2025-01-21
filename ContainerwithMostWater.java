// Time Complexity: O(n) as the two pointer is used
// Space Complexity: O(1) as no extra space is utilized

// Left is initiated with 0 index and right with last index.
// area is calculated and replaced with the next max checking which index is smaller
public class ContainerwithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 })); // 49
        System.out.println(maxArea(new int[] { 1, 1 })); // 1
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int area = Integer.MIN_VALUE;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            area = Math.max(area, minHeight * width);
            if (height[left] < height[right])
                left++;
            else if (height[left] > height[right])
                right--;
            else {
                left++;
                right--;
            }

        }
        return area;
    }
}
