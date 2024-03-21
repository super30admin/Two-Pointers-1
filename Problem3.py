#T.C : O(n)
#S.C: O(1)

#Approach: two pointers
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_element = 0
        n = len(height)
        l = 0
        r = n - 1
        while l < r:
            currArea = min(height[l], height[r]) * (r-l)
            max_element = max(max_element, currArea)
            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        return max_element

