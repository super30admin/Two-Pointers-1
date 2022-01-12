# Time Complexity :
# O(n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english

# first we will check area of first and last element which is height of smaller element*distance
# We will save this area in a maximum variable
# then we will move the pointer pointing to smaller height element to search if we can find bigger area
# If we find the bigger area we will update our maximum variable
# we will keep moving our pointers towards each other until pointers point to same element

# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        p1 = 0
        p2 = len(height)-1
        maximum = -1
        
        while(p1<=p2):
            
            area = min(height[p1], height[p2])*(p2-p1)
            maximum = max(maximum, area)
            
            if (height[p1] >= height[p2]):
                p2 -= 1
            else:
                p1 += 1
                
        return maximum