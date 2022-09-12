# https://leetcode.com/problems/3sum/
# Time: O(N^2) NlogN for sorting and NxN for two pointer approach at each element
# Space O(1) : No extra space used


class Solution:
    def threeSum(self, nums):
        result = []
        
        nums = sorted(nums) # nlogn
        
        for i in range(len(nums)):
            # break as list is sorted when we reach numbers greater than 0, that is the target
            if nums[i] > 0:
                break
            # handle outer duplicates
            if i > 0 and nums[i] == nums[i-1]:
                continue
            target =  -nums[i]
            res = self.findSum(nums, i+1, target)
            if res:
                for r in res:
                    result.append([nums[i], r[0], r[1]])
        
        return result
    
    # Two sum with 2 pointers
    def findSum(self, nums, start, target):
        low, high = start, len(nums) - 1
        res = []
        while(low < high):
            s = nums[low] + nums[high]
            if s == target:
                res.append([nums[low], nums[high]])
                low += 1
                high -= 1
                # handle inner loop duplicates
                while low<high and low > 0 and nums[low] == nums[low-1]:
                    low += 1
                while low < high and high < len(nums)-1 and nums[high] == nums[high + 1]:
                    high -= 1
            elif s > target:
                high -= 1
            else:
                low += 1
                
        return res


nums = [-1,0,1,2,-1,-4]
s = Solution()
print(s.threeSum(nums))

        
        
        