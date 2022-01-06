# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Followed approach from class
# // Your code here along with comments explaining your approach
# Trapping rain water 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        # length of input array
        size = len(height)  #  9 size 1,8,6,2,5,4,8,3,7]
        
        # two pointers, left init as 0, right init as size-1
        left, right = 0, size-1
                8
        
        # maximal width between leftmost stick and rightmost stick
        max_width = size - 1 # 8
        
        # area also known as the amount of water
        area = 0
        
		# trade-off between width and height
        # scan each possible width and compute maximal area
        for width in range(max_width, 0, -1):
            
            if height[left] < height[right]:
                # the height of lefthand side is shorter
                area = max(area, width * height[left] )
                
                # update left index to righthand side
                left += 1
                
            else:
                # the height of righthand side is shorter
                area = max(area, width * height[right] )
                # update right index to lefthand side
                right -= 1
                
        return area