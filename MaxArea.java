// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// idea is to find max area to store water between lines of different heights using two pointers
// using both the pointers being on left and right most positions we multiply the min height of both the lines with width between those lines and store that value inside a max variable
// repeat the operation and get the max value
public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length-1;
        while(l < r){
            // minimum height of both the lines
            int h = Math.min(height[l],height[r]);
            int area = h * ( r - l);
            max = Math.max(area,max);
            //to get the max area
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxArea sol = new MaxArea();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol.maxArea(heights)); // Expected: 49
    }
}
