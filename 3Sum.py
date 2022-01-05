# Time Complexity : O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, I had a very difficult time dealing with duplicates.


# Your code here along with comments explaining your approach

'''Breaking the problem down into a nested 2 sum using the current number as a target.'''



class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        def twoSum(target, left):
            pairs = []
            right = len(nums) - 1
            while left < right:
                curr = nums[left] + nums[right]
                if curr == target:
                    pairs.append([nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                elif curr < target:
                    left += 1
                elif curr > target:
                    right -= 1
            
            return pairs
        
        if len(nums) < 3:
            return []

        answer = []
        nums.sort()
        print(nums)
        for i in range(len(nums) - 2):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                tar = -nums[i]
                ret = twoSum(tar, i + 1)
                if ret:
                    for pair in ret:
                        answer.append(pair + [nums[i]])

        return answer