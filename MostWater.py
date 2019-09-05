"""
Time complexity - O(N)
Space complexity - O(1)
Leetcode - running
The approach here is to maintain two pointers. i and j , i at the first index and j at last index. 
now at every point we check if which pointer has the greater height value between the two indexes
if so we multiply the total len in between these two pointers with the height of the greatest element 
amoung the two pointers. and then increment the i pointer or decrement the j pointer accordingly.
"""

def maxArea(self, height):
        i, j = 0, len(height) - 1
        max_water = 0
    
        while j-i > 0:
            if height[j] > height[i]:
                temp = (j - i) * height[i]
                i = i + 1
            else:
                temp = (j - i) * height[j]
                j = j - 1
            max_water = max(temp,max_water)
        return max_water