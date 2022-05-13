'''
time complexity: O(n)
space complxity: O(1)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        mid = 0
        l = 0
        r = len(nums)-1
        
        while(mid<=r):
            if(nums[mid]==1):
                mid+=1
            elif(nums[mid]==0):
                nums[mid],nums[l] = nums[l],nums[mid]
                l+=1
                mid+=1
                
            else:
                nums[mid],nums[r] = nums[r],nums[mid]
                r-=1
                #mid+=1
        return nums