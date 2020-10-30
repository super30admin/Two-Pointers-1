package Oct29;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
                
/* 
	Time Complexity: O(n) where n is no.of elements in nums array.
	Because we need to iterate through all elements of nums array once.

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
	Two pointer approach used. Low and high pointers placed at the first and last index of the array.
    Area found between low and high and maxArea calculated.
    Either Low or high pointer moved at a time depending on which of them is lesser. Because we hope to get a larger value on moving from the lesser value. It is possible to get a larger area only when heights increase from current heights because width is reducing anyways as we move high and low pointers.
	*/
        
        // edge
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int low = 0, high = height.length-1;
        int area = Integer.MIN_VALUE;
        
        while (low < high) {
            int containerHeight = Math.min(height[low], height[high]);
            int curArea = containerHeight * (high-low);
            area = Math.max(area, curArea);
            if (height[low] < height[high] ) {
                low++;
            } else {
                high--;
            }
        }
        
        return area;
    }
}