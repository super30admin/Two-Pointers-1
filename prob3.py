# Time Complexity : O(N) for the while loop
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


def maxArea(self, height: List[int]) -> int:
        
        lo, hi = 0, len(height) - 1
        res = 0
        while lo < hi:
            num = min(height[lo], height[hi])
            res = max(res, (hi-lo) * num)
            if height[lo] < height[hi]:
                lo += 1
            else:
                hi -= 1
        return res