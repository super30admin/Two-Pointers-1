''' Count Method
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        count0 = 0
        count1 = 0
        count2 = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                count0 += 1

            elif nums[i] == 1:
                count1 += 1

            elif nums[i] == 2:
                count2 += 1

        m = count1 + count0
        n = count0 + count1 + count2

        for i in range(count0):
            nums[i] = 0

        for j in range(count0, m):
            nums[j] = 1

        for k in range(m, n):
            nums[k] = 2
        """
        Do not return anything, modify nums in-place instead.
        """
'''
# Three Pointer Method
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        low = 0
        mid = 0
        high = len(nums)-1
        # Using low as a 0 pointer, mid as a 1 pointer, high as a 2 pointer
        while(mid<=high):
            if nums[mid] ==0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            else:
                mid += 1
