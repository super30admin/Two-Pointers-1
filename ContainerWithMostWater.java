// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes https://leetcode.com/problems/container-with-most-water/
// Any problem you faced while coding this :

//Use 2 pointer to left and right and calculate area, move the pointers based on height of left or right, which ever is less.
//Max area is max variable which stores max area value between all iterations
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0, right = height.length -1;
        int area = 0;
        int max = 0;
        while(left<right) {
            area = Math.min(height[left], height[right])* (right -left);
            max = Math.max(max, area);
            if(height[left]< height[right])
                left++;
            else
                right--;
        }

        return max;
    }
}
