'''

Although I solved this problem many times, but for some reason,
I couldn't remind of logic in the first attempt, but felt relatively easier after solving it.
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:

        right = len(height)-1
        left =0
        max_water = 0

        while(left<right):

            min_container = min(height[left], height[right])

            if((right-left)*min_container > max_water):
                max_water = (right-left)*min_container

            if(height[left]<height[right]):
                left+=1
            else:
                right-=1

        return max_water


