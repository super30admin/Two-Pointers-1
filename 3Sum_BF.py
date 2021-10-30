# Time complexity is O(n^3), so not a good solution.
# Space complexity is O(1)

def three_sum(nums):
    if not nums:
        return []
    nums.sort()
    result = []
    for i in range(len(nums)-2):
        for j in range(i+1, len(nums)-1):
            for k in range(j+1, len(nums)):
                total = nums[i] + nums[j] + nums[k]
                if total == 0:
                    p_answer=[nums[i], nums[j], nums[k]]
                    p_answer.sort()
                    if p_answer not in result:
                        result.append(p_answer)
    return result


nums = [-1, 0, 1, 2, -1, -4]
print(three_sum(nums))

