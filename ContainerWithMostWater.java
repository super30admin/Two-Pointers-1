class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxCap = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int length = Math.min(height[left], height[right]);
            int breadth = right - left;
            int area = length * breadth;
            maxCap = Math.max(area, maxCap);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxCap;
    }
}