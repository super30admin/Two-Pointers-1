class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
       
        #return nums.sort()
        #keep count of 0's,1's and 2's 
        #low,mid and high ptrs method
        low = 0
        mid=0
        high = len(nums)-1
        
        while mid<=high:
            if nums[mid] ==1:
                mid+=1
            elif nums[mid]==2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            else:
                nums[mid],nums[low] = nums[low],nums[mid]
                low+=1
                mid+=1
        return nums
    
#TC: O(n)
#SC: O(1)