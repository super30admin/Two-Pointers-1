#T.C = 0(n) S.C = O(1)
#Set a low,mid and high point low will handle 0 mid will handle 1 and high will handle 2
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        low = 0
        mid = 0
        high = n-1

        while(mid<=high):
            if(nums[mid]==2):
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            elif(nums[mid]==0):
                nums[mid],nums[low] = nums[low],nums[mid]
                low+=1
                mid+=1
            else:
                mid+=1

        return nums
            