#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes
#Use two pointers to sort elements to correct position
class Solution:
    def sortColors(self, nums: List[int]) -> None:
#Initialize pointers
        l=0
        mid=0
        r=len(nums)-1
        while(mid<=r):
#If mid element is 0, swap with left
            if nums[mid]==0:
                nums[mid],nums[l]=nums[l],nums[mid]
                mid += 1
                l += 1
#If mid is 2, swap with right
            elif nums[mid]==2:
                nums[mid],nums[r]=nums[r],nums[mid]
                r -= 1
            else:
#Increment mid if it is 1
                mid += 1
        return
               
            
                
                    
                    
                
                
        