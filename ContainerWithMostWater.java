public class ContainerWithMostWater {
    //Time complexity: length of array / 2 (we are traversing only half)
    //Space complexity: no additional space mused(constant)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        int high = 0;
        while (left < right) {

            if (height[left] > height[right]) {
                high = height[right];
                right--;
            } else {
                high = height[left];
                left++;
            }
            int width = right - left + 1;
            int area = high * width;
            maxArea = maxArea > area ? maxArea : area;

        }

        return maxArea;
    }
}
