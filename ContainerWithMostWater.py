#Time complexity: O(n)
#Space complexity: O(1)
class Solution:
    def maxArea(self, height) -> int:
        area = 0
        i = 0
        j = len(height)-1
        while i <j:
            curr= min(height[i],height[j])*(j-i)
            if curr > area:
                area = curr
            if height[i] < height[j]:
                i+=1
            else:
                j-=1
        return area