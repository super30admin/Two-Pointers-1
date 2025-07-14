
//TC: O(n)
//SC: O(1)
// Implemented using two pointer technique where left is satrting and right is the ending and which ever height is smaller the pointer is moved accordingly.
class MostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) {
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}