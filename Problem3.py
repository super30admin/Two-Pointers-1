#I used a two-pointer technique to efficiently find the maximum area. I started with two pointers, one at the beginning (left) and one at the end (right) of the height array. The area is calculated by the distance between these pointers multiplied by the height of the shorter line. I keep track of the maximum area seen so far. Then, I move the pointer that points to the shorter line inward, because moving the taller line would only decrease the area. I continue this process until the pointers meet. This approach allows me to consider all possible container configurations without having to check every single pair of lines, making it much more efficient than a brute-force solution. The final result is the maximum area found during this process.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        left = 0
        right = len(height) - 1

        while left < right:
            max_area = max(max_area, (right - left) * min(height[left], height[right]))

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area