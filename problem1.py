class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums:
            def swap(nums, mid, idx):
                temp = nums[mid]
                nums[mid] = nums[idx]
                nums[idx] = temp

            left = 0
            mid = 0
            right = len(nums)-1

            while mid <= right:
                if nums[mid] == 0:
                    swap(nums, mid, left)
                    left += 1
                    mid += 1
                    print(nums)
                elif nums[mid] == 1:
                    mid += 1
                    print(nums)
                else:
                    swap(nums, mid, right)
                    right -= 1
                    print(nums)
        
        else:
            return False
                

# Time complexity is O(n) where n is the length of the array
#Space complexity is O(1)
#Approach used is two pointers approach where numbers are swapped based on what values the pointers represent
        