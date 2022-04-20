public class WaterContainer {
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right){
            // To find the area -
            // find out the min among height[left] & height[right]
            // multiply this with the difference between their indices
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);

            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }

        return max;
    }
}
