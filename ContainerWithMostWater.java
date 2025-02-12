// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach:
// We are using 2 pointers here. left and right. We are calculating the area between the 2 pointers and storing the maximum area.

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }

        int left = 0, right = height.length-1;
        int res = 0, area = 0;
        while(left < right){
            area = Math.min(height[left], height[right]) * (right-left);
            res = Math.max(area, res);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}