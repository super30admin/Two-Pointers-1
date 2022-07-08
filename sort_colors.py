# Time complexity: O(n)
# space complexity: O(1)
# Approach: use three pointers -low,mid,high to represent three colors
# low-red(0), mid = blue(1), high = green(2)
# initialise them as low=0, mid = 0, high as last index
# swap mid and low when mid is 0, since its supposed to be at low's index
# since we have taken care of wrong element, increment both mid and low
# swap mid and high if mid is 2 and decerement high only and not increment mid
# because the element at high might be 2.
# if mid is 1 , increment mid.
# run this loop until mid crosses high


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(nums)-1
        mid = 0
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                low = low + 1
                mid = mid + 1   
            elif nums[mid] == 1:
                mid = mid + 1
            else:
                self.swap(nums, high, mid)
                high = high - 1
    def swap(self,nums, i ,j):
        nums[i],nums[j] = nums[j],nums[i]
        