#Using hash map and set
#Time: O(n*2)
#Space: O(n)
from collections import Counter
from collections import defaultdict
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums_len = len(nums)
        if nums_len<3:
            return []
        set_vals = defaultdict(set)
        for index, val in enumerate(nums):
            set_vals[val].add(index)
        #print(set_vals)
        ans = set()
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if (nums[i]+nums[j])*-1 in set_vals:
                    if (i not in set_vals[(nums[i]+nums[j])*-1] and j not in  set_vals[(nums[i]+nums[j])*-1]) or len(set_vals[(nums[i]+nums[j])*-1]) >1:
                        if (i in set_vals[(nums[i]+nums[j])*-1] and j in  set_vals[(nums[i]+nums[j])*-1]) and len(set_vals[(nums[i]+nums[j])*-1]) <3:
                            continue
                        else:
                            ans_set = [nums[i], nums[j], (nums[i]+nums[j])*-1]
                            ans_set.sort()
                            #print(ans_set)
                            ans.add(tuple(ans_set))
        print(ans)
        return [val for val in ans]
        