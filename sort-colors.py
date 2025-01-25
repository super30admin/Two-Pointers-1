# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


zero, one = -1, -1

for two in range(len(nums)):
    if nums[two] == 1:
        one += 1
        nums[one], nums[two] = nums[two], nums[one]
    if nums[two] == 0:
        one += 1
        nums[one], nums[two] = nums[two], nums[one]
        zero += 1
        nums[one], nums[zero] = nums[zero], nums[one]