# Time Complexity : O(n2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

def threeSum(nums):
    res = set()
    nums.sort()

    for i in range(0,len(nums)):
        j = i + 1
        k = len(nums) - 1
        while j < k:
            if nums[i] + nums[j] + nums[k] == 0:
                res.add((nums[i], nums[j], nums[k]))
                j += 1
                k -= 1
            elif nums[i] + nums[j] + nums[k] > 0:
                k -= 1
            else:
                j += 1
    return list(res)

print threeSum([-1,0,1,2,-1,-4])