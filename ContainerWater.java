public class ContainerWater {
    public int containerWater(int[] nums) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while (left<right) {
            int currArea = (right-left) * Math.min(height[left],height[right]);
            area = Math.max(area,currArea);
            if (height[left] >height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }
}
