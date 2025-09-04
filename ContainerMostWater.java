// Time Complexity : O(n) one pass solution
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: Find the area between the vertical lines starting from the left and right until left and right cross each other,
// compare against the current max and store the max area in a global variable
public class ContainerMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int current = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            max = Math.max(max, current);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        final ContainerMostWater containerMostWater = new ContainerMostWater();
        System.out.println(containerMostWater.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7})); //return 49
        System.out.println(containerMostWater.maxArea(new int[] {1, 1})); //return 1
    }
}
