# Time Complexity : O(n^2)
# Space Complexity : O(n^3)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


nums.sort()

triplets = []
for idx in range(len(nums)-2):
    if idx > 0 and nums[idx] == nums[idx-1]:
        continue
    num = nums[idx]
    twoSum = 0 - num
    l, r = idx+1, len(nums) - 1
    
    while l < r:
        sumn = nums[l] + nums[r]
        if sumn == twoSum:
            triplets.append([num, nums[l], nums[r]])
            l += 1
            r -= 1
            while l < r and nums[l] == nums[l-1]:
                l += 1
        elif sumn < twoSum:
            l += 1
        else:
            r -= 1

return triplets
