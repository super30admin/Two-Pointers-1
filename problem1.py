# problem 1

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start_ptr = 0 
        end_ptr = len(nums)-1
        mid_ptr = 0
        while(mid_ptr<=end_ptr):
            if nums[mid_ptr] == 1:
                mid_ptr+=1
            elif nums[mid_ptr] == 0:
                nums[mid_ptr],nums[start_ptr] = nums[start_ptr],nums[mid_ptr]
                start_ptr+=1
                mid_ptr+=1
            else:
                nums[mid_ptr],nums[end_ptr] = nums[end_ptr],nums[mid_ptr]
                end_ptr-=1

        