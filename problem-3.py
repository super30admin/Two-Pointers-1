# Leetcode execution : YES
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        # we use two pointer approach in this problem
        # we also keep area =0 
        area=0
        low=0
        high=len(height)-1
        # we move until low<high for obvious reason that is there cannot be negative area
        while(low<high):
            # we calculate area since the structure formed is rectangle we need length and breath:
                # we caculate breath by difference of high and low
                # we caculate length by getting min of height of low and high
                # we then multiply and get the max of previous area and current calculated area
            area=max((high-low)*min(height[low],height[high]),area)
            if height[high]<height[low]:
                high-=1
            else:
                low+=1
        return area
            
        