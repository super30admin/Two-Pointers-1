// Time Complexity : O(N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Code uses a two-pointer approach, starting from the outermost lines and gradually moving towards the center. The key idea is to maximize
// the area by choosing the longer line between the two pointers and moving the pointers towards each other
public class problem3 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;

    }
}
