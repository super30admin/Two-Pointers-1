// Time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int result = Integer.MIN_VALUE;

        while(left <=right) {
            int temp = Math.min(height[left], height[right]) * (right-left);

            if(temp > result ) {
                result = temp;
            }

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}