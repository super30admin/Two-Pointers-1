# Time Complexity: O(n**2)
# Space Complexity: (n)

def threeSum(nums):
    if len(nums) < 3:
        return []
    
    result = []
    nums = nums.sort()
    n = len(nums)

    for i in range(n):
        if i > 0 and nums[i] < nums[i - 1]:
            continue
        if nums[i] > 0:
            break

        left = i + 1
        right = n - 1
        while(left < right):
            total = nums[i] + nums[left] + nums[right]
            if total < 0:
                left += 1
            elif total > 0:
                right -= 1
            else:
                result.append(nums[i], nums[left], nums[right])
                left += 1
                right -= 1
                while left < right and nums[left] == nums[left - 1]:
                    left += 1
                while left < right and nums[right] == nums[right + 1]:
                    right -= 1
    
    return result
    