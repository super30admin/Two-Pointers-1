#bruteforce solution
#Time Complexity : O(N)
#Space compleity : O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        print(left,right)
        max_volume = 0
        while(left<=right):
            h = min(height[left],height[right])
            max_volume = max(max_volume,h*(right-left))
            if height[left]<=height[right]:
                left+=1
            else:
                right-=1
        return max_volume