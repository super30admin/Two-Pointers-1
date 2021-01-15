# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
	# Brute force is to compute the area for every possible pairs and check which one is max and return it
	
	# Using two pointer approach
	# the only consistent item is the idecies and the deciding factor for choosing the area is heights
	# so for every pointer pair the index is shrinking and the only thing that makes the area to shoot is the max(min(heights))
	# so when ever the l value is less than the h then we can move l+ else h-

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return 0
        l = 0
        h = len(height) - 1
        maxarea = 0
        
        while l < h:
            maxarea = max(maxarea,min(height[l],height[h]) * (h - l))
            if height[l] <= height[h]:
                l += 1
            else:
                h -= 1
        return maxarea
            
        