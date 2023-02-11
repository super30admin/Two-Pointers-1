/*
 * Time Complexity : O(n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - Consider 2 pointers, one from beginning and one from the end. Using the height at the two pointers we caluclate
 * the area and check if it's greater than our previous max. If yes, we update it else we continue. At each iteration we check which
 * pointer contained the constraining height and we increment/decrement that pointer.
 */

//https://leetcode.com/problems/container-with-most-water/description/
class ContainerMaxWater {
    public int maxArea(int[] height) {
        int low=0;
        int high = height.length-1;
        int max=0;
        int area;
        while(low<high){
            area = Math.min(height[low],height[high])*(high- low);
            max = Math.max(max,area);
            if(height[low]<=height[high]){
                low++;
            }else high--;
        }
        return max;
    }
}