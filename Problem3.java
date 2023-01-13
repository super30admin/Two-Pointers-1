public class Problem3 {
    public static void main(String[] args) {
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.print(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start <= end) {
            int water = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, water);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
