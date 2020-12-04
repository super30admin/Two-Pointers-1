''' 
Time complexity :O(N)
Space complexity :O(1)
'''
class Solution:
    def maxArea(self, height) -> int:

        if not height:
            return 0


        maxi = float('-inf')

        low = 0
        high = len(height) - 1

        while low < high:
            maxi = max(maxi,min(height[low],height[high]) *(high-low))
            if height[low] < height[high]:
                low+=1
            else:
                high-=1

        return maxi

s = Solution()
print(s.maxArea([1,8,6,2,5,4,8,3,7]))


        