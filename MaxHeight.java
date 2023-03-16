/*the following implementation uses two pointers to find three sum
 * the time complexity of this implementation is O(n)*/
class MaxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaxArea area = new MaxArea();
        int maxArea = area.maxArea(height);
        System.out.println("The maximum area is: " + maxArea);
    }

}
