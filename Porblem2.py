"""
15. 3Sum
Time Complexity - O(n^2)
Space Complexity - O(1)
Fixed a pointer and then perform 2 pointer approach on entire list and append values in output
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output = []
        nums = sorted(nums)
        for i in range(len(nums)-2):
            if i == 0 or nums[i] != nums[i-1]:
                low = i+1
                high = len(nums)-1
                while(low < high):
                    sum_val = nums[i] + nums[low] + nums[high]
                    if sum_val == 0:
                        output.append([nums[i],nums[low],nums[high]])
                        low += 1
                        high -= 1
                        while low < high and nums[low] == nums[low-1]:
                            low += 1
                        while low < high and nums[high] == nums[high+1]:
                            high -= 1
                    elif sum_val < 0:
                        low += 1
                    else:
                        high -= 1
        return output