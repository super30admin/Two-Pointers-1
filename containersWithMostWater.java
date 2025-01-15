//Container With Most Water
//Tc:O(n)
//SC : O(1)
//O/P : 49
class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Integer output = maxArea(arr);
        System.out.println(output);
    }

    public static int maxArea(int[] height) {
        if (height == null && height.length == 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;

    }
}