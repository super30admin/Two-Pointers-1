# accepted in leetcode
# time - O(N^2), space - O(1)
# sort the nums list and then iterate through the list elements.
# inside first iteration use another iteration where we will be using 2 pointers high and low.
# Then find the sum of 3 numbers and if it is equals to 0, add it to solution list.
# move the pointers based on 3 conditions.
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums is None or len(nums) < 3: return None
        n = len(nums)
        nums = sorted(nums)
        myList = []
        for i in range(len(nums) - 2):
            # check for duplicates
            if i > 0 and nums[i] == nums[i - 1]: continue
            low = i + 1
            high = n - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    myList.append([nums[i], nums[low], nums[high]])
                    high -= 1
                    low += 1
                    # check for duplicates
                    while (low < high and nums[low] == nums[low - 1]): low += 1
                    # check for duplicates
                    while (low < high and nums[high] == nums[high + 1]): high -= 1
                elif sum > 0:
                    high -= 1
                else:
                    low += 1

        return myList