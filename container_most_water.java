//TC: O(n)
//SC: O(1)
//approach: 2 pointers

public class container_most_water {
    class Solution {
        public int maxArea(int[] height) {
            int left=0;
            int right=height.length-1;
            int maxHeight=0;
            int maxArea=0;
            while(left<right) {
                if (height[left] > maxHeight && height[right] > maxHeight) {
                    maxHeight = Math.min(height[left], height[right]);
                    maxArea = Math.max(maxArea, maxHeight * (right - left));
                }
                if(height[left]==height[right]) {
                    left++;
                    right--;
                }
                else if(height[left]<height[right])
                    left++;
                else
                    right--;
            }
            return maxArea;
        }
    }
}
