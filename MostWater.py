'''
time complexity: O(n)
space complexity: O(1)
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left = 0
        right = len(height)-1
        area = 0
        while(left<right):
            area = max(area,(right-left)*min(height[left],height[right]))
            
            if(height[left]>height[right]):
                right-=1
            else:
                left+=1
        return area
        