class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == 0 or len(nums) == 0:
            return []
        n = len(nums)
        result = []
        nums.sort()
        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            left = i + 1
            right = n - 1
            while left < right:
                triplet = nums[i] + nums[left] + nums[right]
                if triplet == 0 :
                    result.append([nums[i], nums[left], nums[right]])
                    left = left + 1
                    right = right - 1
                    while left < right and nums[left] == nums[left-1]:
                        left = left + 1
                    while left < right and nums[right] == nums[right+1]:
                        right = right - 1
                elif triplet < 0:
                    left = left + 1
                else:
                    right = right - 1

        return result

        