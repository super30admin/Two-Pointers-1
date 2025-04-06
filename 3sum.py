'''
During class two pointer was discussed.

Instructor mentioned to try out with Hashset while finding two sum,

Obseration:
The problem is timing out, when the array is not sorted, and without the condition:
      if(nums[i]==nums[i-1] and i>0):
                continue

'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result= defaultdict(list)
        nums.sort()

        for i in range(len(nums)):
            if(nums[i]==nums[i-1] and i>0):
                continue
            low = i+1
            hash_set = set()

            for j in range(low, len(nums)):
                if(nums[j]==nums[j-1]):
                    continue
                if (-1*(nums[i]+nums[j]) in hash_set):
                    k = [nums[i],nums[j], -1*(nums[i]+nums[j])]
                    k.sort()
                    z=tuple(k)
                    result[z]=k
                else:
                    hash_set.add(nums[j])



        return list(result.values())




