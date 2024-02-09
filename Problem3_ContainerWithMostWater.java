// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Using two pointer approach, take one point at 0th index and second point at N-1 index
// By calculating the area of the container formed, decide to move the left or right pointer based on min height
// Have a variable to keep track of the max area
// pointer at the min height can be moved until a greater height is found as it can increase the area

public class Problem3_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0, r=n-1, max=0;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int area = h * (r-l);
            max = Math.max(max, area);
            while(l<r && height[l]<=h) l++;
            while(l<r && height[r]<=h) r--;
        }
        return max;
    }
}
