#Time complexity  o(n) for moving across the list.
#Space Complexity is o(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        length_of_array=len(height)
        l_pointer=0
        r_pointer=length_of_array-1
        output=0
        while l_pointer < r_pointer:
            height_min= min(height[l_pointer],height[r_pointer])
            area= height_min*(r_pointer-l_pointer)
            output= max(output,area)
            if height[l_pointer]<height[r_pointer]:
                l_pointer += 1
            else:
                r_pointer -= 1
        return output