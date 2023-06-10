// Time Complexity : O(n) as we traverse the array linearly just once
// Space Complexity : O(1) no auxiliary data structure used
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
class ContainerWithMostWater {
    public int maxArea(int[] height) {

        if(height == null || height.length <2){
            return 0;
        }
        int length = 1;
        int width = 1;
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left < height.length && right >= 0 && left < right){
            if(left >= right){
                break;
            }
            if(height[left] == 0){
                left++;
                continue;
            }
            if(height[right] == 0){
                right--;
                continue;
            }
            length = Math.min(height[right], height[left]);
            width = right - left;
            int area = length * width;

            maxArea = Math.max(maxArea, area);

            if(height[left]< height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }else{
                left++; right--;
            }
        }
        return maxArea;
    }
}

