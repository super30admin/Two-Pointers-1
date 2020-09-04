"""
Container with most water

"""

class Solution:
    def maxArea(self, height: List[int]) -> int:

        left = 0
        right = len(height)-1
        area = 0
        while left < right:

            area =  max(area, (right - left) * (min(height[left], height[right])))

            if height[left] < height[right]:
                left +=1

            else:
                right -=1
        return(area)


"""
Time Complexity: O(n)
Space Complexity : O(1)

"""

"""
1) Take two pointers left and right which will help in area calculation
2)left points to the beginning of the array and right points end of the array
3)Area is found by multiplying left and right elements and max amongst the area is returned.
4)Left is incremented when element at left is smaller than element at right, right is decremented based if element at right is smaller than left
"""
