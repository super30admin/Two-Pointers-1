# sort colors
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums)==0: return nums
        low=0
        mid=0
        high=len(nums)-1
        
        while mid<=high:
            
            if nums[mid]==1: 
                mid=mid+1
            elif nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high=high-1
                
            else:
                nums[mid],nums[low]=nums[low],nums[mid]
                mid=mid+1
                low=low+1
        return nums
		
		
		
#Container with maximum area
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low=0
        high=len(height)-1
        area=0

        while low<high:
            if height[low]<height[high]:
                area=max(area, (high-low)*height[low])
                low=low+1
            else:
                area=max(area, (high-low)*height[high])
                high=high-1

        return area
		

            
                
                