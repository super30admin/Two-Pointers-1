#Time Complexity: O(N) single pass two pointer approach
#Space Complexity : O(1) as it is in place

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #KANIKA
        low = 0
        mid = 0
        high = len(nums)-1

        while(mid <= high):
            if(nums[mid] == 2):
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            elif(nums[mid]==0):
                nums[mid],nums[low] = nums[low],nums[mid]
                mid+=1
                low+=1
            else:
                mid+=1
        return nums
        