// Time Complexity : O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach
class Solution {
	public int maxArea(int[] height) {
		 int max = 0;
		 int low = 0, high = height.length - 1;
		 while(low < high) {
			  max = Math.max(max, ((high-low)*Math.min(height[low], height[high])));
			  if(height[low] > height[high]) high--;
			  else low++;
		 }
		 return max;
	}
}