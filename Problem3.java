// Time Complexity : O(n) as it will traverse all elements in height
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem3 {
    public int maxArea(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left <= right){
            int len1 = Math.min(height[left], height[right]);
            int len2 = right - left;
            int area = len1 * len2;
            max = Math.max(max, area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;

    }
}
