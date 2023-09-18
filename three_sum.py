# Time Complexity: O(n^2) where n is the length of the array 
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if(len(nums) <3):
            return []
        res = []
        
        nums.sort() # sorted array to use two pointers
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            # target = -nums[i]
            left = i+1
            right = len(nums)-1
            while(left < right):
                curr_sum = nums[left] + nums[right] + nums[i] 
                if curr_sum == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while(left < right and nums[left]== nums[left -1]):
                        left += 1
                    while(left < right and nums[right] == nums[right+1]):
                        right -= 1
                elif curr_sum < 0:
                    left += 1
                else:
                    right -= 1
        return res



        # if(len(nums) <3):
        #     return []
        # for i in range(len(nums)):
        #     d = dict()
        #     target = -nums[i]
        #     for j in range(i+1,len(nums)):
        #         d[nums[j]] = j
        #     for j in range(i+1,len(nums)):
        #         a = nums[j]
        #         diff = target - a
        #         if diff in d and d[diff] != j:
        #             k = [diff,nums[i],nums[j]]
        #             k.sort()
        #             if k not in l:
        #                 l.append(k)
        # return l
