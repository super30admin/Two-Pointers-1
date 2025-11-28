# https://leetcode.com/problems/container-with-most-water/

# Using two pointer finding the area between two lines. Change the pointer position which pointing the shorter line and track the maximum area found.
# Time Complexity- O(n) Space Complexity- O(1)

class Solution:
    def maxArea(self, height: list[int]) -> int:
        n = len(height)
        low = 0
        high = n - 1
        area = 0

        # till both pointers don't cross each other
        while low < high:
            # intial height
            ht = 0
            # width of the container
            width = high - low

            # when low pointer is less than high 
            if height[low] < height[high]:
                ht = height[low]
                # as we need taller line for more area, increase the low 
                low += 1
            else:
                ht = height[high]
                # as we need taller line for more area, decrease the high because that is less than low at this point
                high -= 1
            # find out the area with previously found and currently found
            area = max(area, ht * width)
        
        return area
    
solution = Solution()
print(solution.maxArea([1,8,6,2,5,4,8,3,7]))


        