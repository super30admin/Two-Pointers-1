#time complexity = O(n)
#space complexity = O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        #TWO POINTERS
        area =0
        left =0
        right = len(height) -1

        while left< right:
            wid = right - left
            #taking the smallest of right or left boundary and * to width
            area = max(area, min( height[left], height[right]) * wid)

            #we increase the left or right based on whicever is the smaller one for the next ieration
            if height[left] <= height[right]:
                left +=1
            else:
                right -=1
                 
        return area
