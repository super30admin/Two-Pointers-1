# Time complexity: O(n^2 + nlogn) = O(n^2)
# Space complexity: O(1)

def threeSum(nums):
    if len(nums) == 0:
        return []

    nums.sort()
    result = []
    for i in range(len(nums)-2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        j = i+1
        k = len(nums)-1
        while j < k:
            total = nums[i]+nums[j]+nums[k]
            if total > 0:
                k -= 1
            elif total < 0:
                j -= 1
            else:
                result.append([nums[i], nums[j], nums[k]])
                while j < k and nums[j] == nums[j+1]:
                    j += 1
                while j < k and nums[k] == nums[k-1]:
                    k -= 1
                j += 1
                k -= 1
    return result


print(threeSum([1, 0, -1, 2, 0, -1, 4]))
