'''
Problem3 (https://leetcode.com/problems/container-with-most-water/)
'''

'''
Time Complexity : O(N)
Space Complexity : O(1)
'''
'''
Approach : 
Compute the area // min(left and right) * distance
then check if present area is max or not
then change pointer with less height
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        result = 0
        left = 0
        right = len(height)-1
        while(left<right):
            area = (right - left) * min(height[left],height[right])
            if (area > result):
                result = area
            if(height[left]>=height[right]):
                right = right - 1
            else :
                left = left + 1
        return result
                