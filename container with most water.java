time compelxity: O(nlogn)
space complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
      if (height == null || height.length < 2) { //initial check
		return 0;
	}
 
	int max = 0; //using two pointers
	int left = 0;
	int right = height.length - 1;
 
	while (left < right) { 
		max = Math.max(max, (right - left) * Math.min(height[left], height[right])); //getting max value
		if (height[left] < height[right])  //if less, then move left to right side
			left++;
		else
			right--; //or move right to left side
	}
 
	return max;
}  
    }