class Solution:
    '''
    TC: O(n)
    SC: O(1)
    Leetcode: Solved the problem
    Issue: No issue
    '''
    def maxArea(self, height):
        low = 0
        high = len(height) - 1
        res = 0
        while low <= high:
            h = min(height[low], height[high])
            w = high - low
            res = max(res, h*w)
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return res
    
    '''
    TC: O(n^2)
    SC: O(1)
    '''
    def maxArea(self, height):
        n = len(height)
        res = 0
        for i in range(n-1):
            for j in range(1, n):
                h = min(height[i], height[j])
                w = j - i
                res = max(res, h*w)
        return res


s = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(s.maxArea(height))
height = [1,1]
print(s.maxArea(height))