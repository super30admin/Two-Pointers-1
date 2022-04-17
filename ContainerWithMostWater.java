// Time Complexity : O(N) Two Pointer approach
// Space Complexity : O(1) No extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        if(height.length == 0 || height == null){
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(left < right){

            int area = Math.min(height[left],height[right]) * (right - left);
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
