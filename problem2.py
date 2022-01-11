"""
// Time Complexity : O( N*N)  N number of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        print(nums)
        nums = sorted(nums)
        output = []
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            target = 0 - nums[i]
            l = i+1
            h = len(nums) -1
            while l < h :
                if nums[l] + nums[h] == target:
                    output.append([nums[i], nums[l], nums[h]])
                    l+= 1
                    h-=1
                    while l < h and nums[l] == nums[l - 1]:
                        l+= 1
                    while l < h and nums[h] == nums[h + 1]:
                        h-= 1
                elif nums[l] + nums[h] < target:
                    l += 1
                else:
                    h -=1
        return output