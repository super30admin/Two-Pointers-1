# 15 3 sum

#1
# // Time Complexity : O(n^2 logn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 

# using for loop and two pointer
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = set()
        nums.sort() # log(n)
        for p0 in range(n): #O(n)
            # Using two pointers
            p1 = p0+1
            p2 = n-1
            while(p1 < p2): # 
                if nums[p0] + nums[p1] + nums [p2]==0:
                    res.add((nums[p0],nums[p1],nums[p2]))
                    p1 +=1
                    p2 -=1
                elif nums[p1]+ nums[p2] + nums[p0] > 0:
                    p2 -=1
                else:
                    p1+=1
        return res


#2
# // Time Complexity : O(n^2 logn)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # using for loop and hashmap
        n = len(nums)
        res = set()
        nums.sort() # log(n)
        for p0 in range(n): #O(n)
            target = - nums[p0]
            hashmap = dict()
            for i in range(p0+1,n): # O()
                if target - nums[i] in hashmap:
                    res.add((-target, nums[i],hashmap[target - nums[i]]))
                else:
                    hashmap[nums[i]] = nums[i]
        return res