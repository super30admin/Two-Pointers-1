#Time Complexity: O(n)
#Space Complexity: O(1)
#LeetCode: Yes

'''
Approach: Prioritize height instead of width. Height can increase, width will always decrease.
'''
class Solution:
    def maxArea(self, height):
        i, j = 0, len(height)-1
        max_area = 0
        while(i<j):
            max_area = max(max_area, min(height[i], height[j])*(j-i))
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        return max_area

obj = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(obj.maxArea(height))