'''
Use a two-pointer technique with one pointer at the beginning and one at the end of the array to find the container with the most water.
At each step, calculate the area formed between the two lines and update the maximum area.
Move the pointer pointing to the shorter line inward to potentially find a larger container.

Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) -1
        result = 0

        while left < right:
            result = max(result, ((right-left)*min(height[left], height[right])))
            if height[left] < height[right]:
                left +=1
            else:
                right-=1
        return result
