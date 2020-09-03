# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Before class:
# Maintain a maxm so far variable and update it only if the area increases

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        max_so_far = 0
        # define two pointers, one moves from the left side, other moves from the right side
        left = 0
        right = len(height)-1

        # until left is less than right, traverse through the array
        while left<right:
           
            # calculate area between two pointers, taking width bwteen them and length of the shorter side
            area = min(height[left], height[right])*(right-left)
            
            #if this area is less than or equal to the maxm area so far, update the max area
            if area >= max_so_far:
                max_so_far = area

            # now update the pointer with shorter length to move one step forward/backward
            if height[left] < height[right]:
                left +=1
            else:
                right-=1
            
        # return the maximum area calculated after going through all possible combos
        return max_so_far
            