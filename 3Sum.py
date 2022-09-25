# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# 1- brute force comparing each elements - O(n^3) & O(1)
# 2 - hashing - O(n^2) & O(n)
# 3 - two pointers - O(n^2) & O(1)
# 4 - Binary search - O(n^2 * log(n) & O(1) 


# 3 - two pointers - O(n^2) & O(1) --> Optimized

class Solution:
    def threeSum(nums):
        res = set()
        if nums == None or len(nums) == 0:
            return res
        n = len(nums)
        nums = sorted(nums)
        
        for i in range(0,n-2):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue 
            low = i+1
            high = n-1
            while low<high:
                s = nums[i]+nums[low]+nums[high]
                if s == 0:
                    res.add(tuple(sorted((nums[i],nums[low],nums[high]))))
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
                elif s >0:
                    high -= 1
                else:
                    low += 1
        return res




# 1- brute force comparing each elements - O(n^3) & O(1)
class Solution:
    def threeSum(nums):
        if nums == None or len(nums) == 0:
            return []
        s = set()
        n = len(nums)
        for i in range(0,n-2):
            for j in range(i+1,n-1):
                for k in range(j+1,n):
                    if nums[i]+nums[j]+nums[k] == 0:
                        s.add(tuple(sorted((nums[i],nums[j],nums[k]))))
        return map(list,s)

# nums = [-1,0,1,2,-1,-4]
# print(Solution.threeSum(nums))


