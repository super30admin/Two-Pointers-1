"""
Time Complexity: 0(n)
Space Complexity: 0(1)
Approach: 
    1. Use Two Ptrs, keep one at left and one at right
    2. Cal width and height
    3. Cal local area 
    4. Update max area
    5. Move either lft or rt ptr based upon which height is less at that index
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:

        lft = 0
        rt = len(height) - 1

        # initialize result_area
        result_area = 0

        while lft < rt:

            # get length
            length_x = min(height[lft], height[rt])

            # get breadth
            breadth_x = abs(rt - lft)

            # cal area
            area = length_x * breadth_x

            # update result_area
            result_area = max(result_area, area)

            # decide to move which ptr
            if height[lft] >= height[rt]:
                rt -= 1
            else:
                lft += 1
        # end of while loop

        return result_area
        