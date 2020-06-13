// Time Complexity : O(n). n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
     if(height==null || height.length<2) return 0;
		
		int i=0,j=height.length-1,maxArea=0;
		while(i<j) {
			int area=0;
			if(height[i]<height[j]) {
				area = height[i]*(j-i);
				i++;
			}else {
				area = height[j]*(j-i);
				j--;
			}
			
			maxArea=Math.max(maxArea, area);
		}
		return maxArea;   
    }
}
