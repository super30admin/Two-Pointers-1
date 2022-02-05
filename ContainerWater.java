public class ContainerWater {
    public int containerWater(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;

        while (left < right) {

            int currArea = Math.min(nums[right], nums[left]) * (right - left);
            maxArea = Math.max(maxArea, currArea);
            if (nums[left] > nums[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
