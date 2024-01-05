'''

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

Here the height of the container among the two pointers is always smallest one among the two. Update the smallest height to
the next element always
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        area = 0

        while i < j:
            area = max(area, (j-i) * min (height[i],height[j]))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1

        return area