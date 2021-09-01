class Solution:
    def maxArea(self, height: List[int]) -> int:
        L = 0
        R = len(height)-1
        maxarea = R*min(height[L], height[R])
        while(L != R):
            if height[L] > height[R]:
                R -= 1
            else:
                L += 1
            x = (R-L)*min(height[L], height[R])
            if x > maxarea:
                maxarea = x

        return maxarea