// Maintain two pointers at the beginning and one at the end. And for each point calculate the area and update the maxarea seen so far. 
// And increment or decrement the left and right pointers after each iteration. 

// Time Complexity : O(n), where n is the length of the input array
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;
        int left = 0, right = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        int leftHeight = 0, rightHeight = 0, usableHeight = 0, area = 0;

        while (left < right) {
            leftHeight = heights[left];
            rightHeight = heights[right];

            usableHeight = Math.min(leftHeight, rightHeight);
            area = usableHeight * (right - left);
            maxArea = Math.max(maxArea, area);

            if (leftHeight > rightHeight) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        Collections.addAll(inputs, new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }, new int[] { 1, 1 },
                new int[] { 4, 3, 2, 1, 4 }, new int[] { 1, 2, 1 });

        for (int[] heights : inputs) {
            System.out.println(maxArea(heights));
        }
    }
}
