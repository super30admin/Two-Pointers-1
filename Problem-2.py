#tc: O(n^2)
#sc: O(n)

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # using hash set
        ans_set = {}
        ans = []
        for i in range(len(nums)):
            j = i+1
            target = 0 - nums[i]
            # 2 sum
            hset = set()
            while j < len(nums):
                if target - nums[j] in hset:
                    curr_ans = [nums[i],nums[j],target-nums[j]]
                    curr_ans.sort()
                    if tuple(curr_ans) not in ans_set:
                        ans_set[tuple(curr_ans)] = 1
                        ans.append(curr_ans)
#                     else:
                        
#                         ans_set[tuple(curr_ans)] = 1
                else:
                    hset.add(nums[j])
                j += 1
             
        return ans
                         
        
        # result = []
        # nums.sort()
        # for i, a in enumerate(nums):
        #     if i>0 and nums[i] == nums[i-1]:
        #         continue
        #     l,r = i+1, len(nums)-1
        #     while(l<r):
        #         threesum = a + nums[l] + nums[r]
        #         if threesum == 0:
        #             result.append([a,nums[l],nums[r]])
        #             l += 1
        #             while l<r and nums[l] == nums[l-1]:
        #                 l += 1
        #         elif threesum>0:
        #             r -= 1
        #         else:
        #             l += 1
        # return result
                    
            