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
# O(N): Need 1 traversal on the entire input array.

#------------------
# Space Complexity: 
#------------------
# O(1): Not using auxiliary data structure. Just variables to store
#       length, breadth, and max area

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  692 ms (84.42 %ile)
# Space            :  27.1 MB (57.13 %ile)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        if n == 0 or n==1:
            return 0
        
        elif n == 2:
            return (min(height[0], height[1]))

        else:
            low = 0
            high = n-1
            max_area = -1

            while low < high:
                breadth = high - low
                if height[low] <= height[high]:
                    length = height[low]
                    low += 1
                else:
                    length = height[high]
                    high -=1

                max_area = max(max_area, length * breadth)

        return max_area

