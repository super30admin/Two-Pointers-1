class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        if nums is None and len(nums) == 0: return
        result = []
        nums = sorted(nums)
        for idx in range(len(nums) - 1):
            if idx > 0 and nums[idx] == nums[idx - 1]: continue
            low, high = idx + 1, len(nums) - 1
            while low < high:
                total_sum = nums[idx] + nums[low] + nums[high]

                if total_sum == 0:
                    result.append([nums[idx], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]): low += 1
                    while (low < high and nums[high] == nums[high + 1]): high -= 1

                elif total_sum > 0:
                    high -= 1
                else:
                    low += 1
        return result


#space:-O(1)
    #ytime:_O(n*n)