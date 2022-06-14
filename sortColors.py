#// Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        twoPointer = len(nums)-1
        zeroPointer = 0
        curr = 0
        while curr <= twoPointer:
            if nums[curr] == 2:
                nums[curr], nums[twoPointer] = nums[twoPointer],nums[curr]
                twoPointer -=1
            elif nums[curr] == 0:
                nums[curr],nums[zeroPointer] = nums[zeroPointer],nums[curr]
                zeroPointer +=1
                curr+=1
            else:
                curr+=1
