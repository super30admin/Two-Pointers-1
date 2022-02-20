#TC:O(nlongn) + O(n^2), for sorting and traversing
#SC:O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        ans_set = set()
        for i in range(len(nums) - 2):
            if nums[i] > 0: 
                break
            if i > 0 and nums[i] == nums[i-1]: # not i+1 see [-1,-1,0,2,1]
                continue                       # i> 0 as [0,0,0]
            l = i+1
            r = len(nums) - 1
            while (l < r):
                curr_sum = nums[i] + nums[l] + nums[r]
                if curr_sum == 0:
                    ans.append([nums[i], nums[l], nums[r]])
                    while l < r and nums[l] == nums[l+1]:
                        l += 1
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                elif curr_sum < 0:
                    l += 1
                else:
                    r -= 1
        return ans