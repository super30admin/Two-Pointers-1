#O(n^2) time and O(n) space

def threeSum(nums, targetSum):
    nums.sort()
    result = []
    targetSum = 0
    for i in range(len(nums) -2):
        left = i + 1
        right = len(nums) - 1
        while left < right:
            currentSum  = nums[i] + nums[left] + nums[right]
            if currentSum == targetSum:
                result.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1
            elif currentSum < targetSum:
                left += 1
            elif currentSum > targetSum:
                right -= 1
    return result

print(threeSum([12,3,1,2,-6,5,-8,6], 0))