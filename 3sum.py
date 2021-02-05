# O(N ^ 2) TIME AND O(1) SPACE
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []
        for i in range(len(nums)-2):
            if i !=0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                if left > i + 1 and nums[left] == nums[left-1]:
                    left += 1
                    continue
                if nums[i] + nums[left] + nums[right] == 0:
                    triplets.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1
                elif nums[i] + nums[left] + nums[right] < 0:
                    left += 1
                else:
                    right -= 1
        return triplets