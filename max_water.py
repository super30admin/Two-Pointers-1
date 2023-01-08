# Time Complexity :
# O(N*M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#Keep a right pointer and left pointer. Calculate the area between these points. 
#Now we move the left pointer to the right if the height is lower at left pointer loc or
#move the right pointer to the left if height is smaller at right pointer

class Solution:
    def maxArea(self, height: List[int]) -> int:
        right_loc = len(height) -1
        left_loc = 0
        max_area = -1

        while (left_loc < right_loc):
            area = (right_loc - left_loc) * min(height[left_loc],height[right_loc])
            max_area = max(area,max_area)
            if height[left_loc] < height[right_loc] :
                left_loc += 1
            else :
                right_loc -= 1

        return max_area
