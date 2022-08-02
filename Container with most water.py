'''
Time Complexity: O(N), where N is the length of list height
Space Complexity: O(1)
Executed Successfully: Yes
Challenges Faced: No
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == [] or len(height) == 0:
            return 0
        mv = 0
        l,r = 0,len(height)-1
        while l <= r:
            ma = (r-l)*min(height[l],height[r])
            mv = max(mv,ma)
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return mv
            