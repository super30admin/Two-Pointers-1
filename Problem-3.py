#tc: O(n)
#sc: O(1)

class Solution:
    def maxArea(self, height) -> int:
        def computeArea(l,r):

            if height[l] <= height[r]:
                
                area = height[l]*(r-l)
            else:

                area = height[r]*(r-l)
            return area
        
        l, r = 0, len(height)-1
        max_area = 0
        while(l<r):
            curr_area = computeArea(l,r)
            max_area = max(curr_area,max_area)
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return max_area

obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))