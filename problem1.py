# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # bubble sort
        # n = len(nums)

        # for i in range(n):
        #     for j in range(n-i-1):
        #         if nums[j]>nums[j+1]:
        #             nums[j], nums[j+1] = nums[j+1], nums[j]

        # Dutch National Flag Algorithm
        low = 0
        mid = 0
        high = len(nums)-1

        while mid<=high:
            if nums[mid]==0:
                # swap mid, low
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid]==1:
                mid += 1
            else:
                #swap mid, high
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        
