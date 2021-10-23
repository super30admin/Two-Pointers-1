# TC-O(n*2)
# SC-O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums ) <3:
            return []
        nums.sort()
        print(nums)
        result =[]
        for i in range(len(nums ) -2):
            if i!= 0 and nums[i - 1] == nums[i]:
                continue
            j = i + 1
            k = len(nums) - 1
            while (j < k):
                if nums[j] + nums[k] == -nums[i]:
                    result.append([nums[i], nums[j], nums[k]])
                    j = j + 1
                    k = k - 1
                    while j < k and nums[j - 1] == nums[j]:
                        j += 1
                    while j < k and nums[k + 1] == nums[k]:
                        k -= 1

                elif nums[j] + nums[k] < -nums[i]:
                    j = j + 1
                    while j < k and nums[j - 1] == nums[j]:
                        j += 1
                else:
                    k = k - 1
                    while j < k and nums[k + 1] == nums[k]:
                        k -= 1

        return result