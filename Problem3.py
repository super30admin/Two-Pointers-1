#Two Pointers-1
#Problem2 : Leetcode https://leetcode.com/problems/container-with-most-water/
#All test cases passed on Leetcode
#Time Complexity-O(N)
#Space Complexity-O(1)

class Solution:
    def maxArea(self, height):
        max_area=0
        left=0
        right=len(height)-1
        while left<right:
            if height[left]<height[right]:
                max_area=max(max_area,height[left]*(right-left))
                left+=1
            else:
                max_area=max(max_area,height[right]*(right-left))
                right-=1
        return max_area
                    
  
sol = Solution()
res=sol.maxArea([1,8,6,2,5,4,8,3,7])
print(res)



        
        















