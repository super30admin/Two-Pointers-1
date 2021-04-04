class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return

        final_array = []
        nums = sorted(nums)

        for i in range(len(nums) - 2):
            low = i + 1
            high = len(nums) - 1
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            while low < high:
                element_sum = nums[i] + nums[low] + nums[high]
                if element_sum == 0:
                    final_array.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while nums[low] == nums[low - 1] and low < high:
                        low += 1
                    while nums[high] == nums[high + 1] and low < high:
                        high -= 1

                elif element_sum < 0:
                    low += 1
                else:
                    high -= 1
        return final_array
