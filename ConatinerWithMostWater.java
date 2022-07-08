// Time Complexity : O(n) As iterating just once with all the elements in the array
// Space Complexity : O(1), Using no extra DS.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ConatinerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer <= rightPointer) {
            int area = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            maxArea = Math.max(area, maxArea);

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else if (height[leftPointer] > height[rightPointer]) {
                rightPointer--;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ConatinerWithMostWater cwmo = new ConatinerWithMostWater();
        System.out.println(cwmo.maxArea(height));
    }

}
