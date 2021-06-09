'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 11. Container With Most Water

# Given n non-negative integers a1, a2, ..., an , where each represents a 
# point at coordinate (i, ai). n vertical lines are drawn such that the two
# endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, 
# together with the x-axis forms a container, such that the container contains
# the most water.

#-----------------
# Time Complexity: 
#-----------------
# O(N^2): Need O(N^2) traversal on the array.

#------------------
# Space Complexity: 
#------------------
# O(1): No auxiliary data structure. Just variables to store max_water

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?:  No (Time limit exceeded because of bruteforce)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        if n == 0 or n==1:
            return 0
        
        elif n == 2:
            return (min(height[0], height[1]))

        else:
            max_water = 0
            for i in range(n):
                for j in range(i+1, n):
                    max_water = max(max_water, \
                                    (min(height[i], height[j]) * (j-i)))
        
        return max_water