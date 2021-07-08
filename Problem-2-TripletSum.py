class Solution:
    def threeSum(self, nums) :
        result = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                self.twoSum(nums, i, result)
        return result

    def twoSum(self, nums, i, res):
        low = i + 1
        high = len(nums) - 1
        while (low < high):
            sum = nums[i] + nums[low] + nums[high]
            if sum < 0:
                low += 1
            elif sum > 0:
                high -= 1
            else:
                res.append([nums[i], nums[low], nums[high]])
                low += 1
                high -= 1
                while low < high and nums[low] == nums[low - 1]:
                    low += 1

sol=Solution()
arr=[2,1,0,1,-4,1,-2,-1,]
print (sol.threeSum(arr))