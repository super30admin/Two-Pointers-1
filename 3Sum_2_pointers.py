# So the idea behind this approach is to eliminate the inner two loops and use two pointers instead to
# apply so as to use the approach of the two sum problem. Line number (18,19) and (11,12) tackle the problem of dupicates for us


def three_sum(nums):
    if not nums:
        return[]
    result = []
    nums.sort()
    for i in range (len(nums) -2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        low, high = i+1, len(nums)-1
        while low < high:
            total = nums[i] + nums[low] + nums[high]
            if total == 0:
                result.append([nums[low], nums[i], nums[high]])
                low += 1
                while(low < high) and nums[low] == nums[low-1]:
                    low += 1
            elif total > 0:
                high -= 1
            else:
                low += 1
    return result


nums = [-1, 0, 1, 2, -1, -4]
print(three_sum(nums))

