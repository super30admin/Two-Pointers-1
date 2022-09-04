'''
15. 3Sum

APPROACH: brute force
TIME COMPLEXITY: O(N^3)
SPACE COMPLEXITY: O(1)
LEETCODE: Timed out
100 random inputs: Passed
DIFFICULTY: Nope

APPROACH: Hash map
TIME COMPLEXITY: O(N^2)
SPACE COMPLEXITY: O(N)
LEETCODE: Yes
100 random inputs: Passed
DIFFICULTY: Nope

APPROACH: linear and two pointer
TIME COMPLEXITY: O(Nlogn)
SPACE COMPLEXITY: O(N)
LEETCODE: --
100 random inputs: --
DIFFICULTY: CODING YET NOT COMPLETED

APPROACH: linear and binary search
TIME COMPLEXITY: O(N2logn)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
100 random inputs: Yes
DIFFICULTY: nope

'''

class Solution:
    def brute_force(self, nums):
        res = {(-1,-1,-1)}
        res1 = []
        n = len(nums)
        for i in range(0, n):
            s = nums[i]
            for j in range(i+1, n):
                s += nums[j]
                for k in range(j+1, n):
                    if s + nums[k] == 0:
                        t = tuple(sorted([nums[i], nums[j], nums[k]]))
                        if t in res:
                            continue
                        else:
                            res.add(t)
                            res1.append(list(t))
                s -= nums[j]
            
        return list(res1)
        
    
    def hash_map(self, nums):
        res = {(-1,-1,-1)}
        
        n = len(nums)
        for i in range(0, n):
            target = 0 - nums[i]
            m = {}
            for j in range(i+1, n):
                t = target - nums[j]
                if t in m:
                    m[nums[j]] = j
                    res.add(tuple(sorted([nums[i], nums[j], t])))
                else:
                    m[nums[j]] = j
        
        res.remove((-1,-1,-1))
        res1 = []
        for i in res:
            res1.append(list(i))
        return res1
    
    
    def two_pointers(self, nums):
        res = {(-1,-1,-1)}
        nums = sorted(nums) # n*logn
        n = len(nums)
        for i in range(0, n):
            target = 0 - nums[i]
            p1 = i+1
            p2 = n-1
                
            while p1 <= p2:
                
                if nums[p1] + nums[p2] == target:
                    res.add((nums[i], nums[p1], nums[p2]))
                    p1 += 1
                    p2 -= 1
                elif target - nums[p1] > target - nums[p2]:
                    p1 += 1
                else:
                    p2 -= 1
                
        
        res.remove((-1,-1,-1))
        res1 = []
        for i in res:
            res1.append(list(i))
        return res1
        
    
    def binary_search(self, nums):
        res = {(-1,-1,-1)}
        nums = sorted(nums) # n*logn
        n = len(nums)
        
        for i in range(0, n): # N
            t1 = 0 - nums[i]
            if i > 1 and nums[i]==nums[i-1]:
                continue
            for j in range(i+1, n-1): # N
                t2 = t1 - nums[j]
                l = j+1
                h = n-1
                if t2 > nums[h] or t2 < nums[l]:
                    continue
                while l <=h: # logn
                    m = (l+h) //2
                    if nums[m] == t2:
                        res.add(tuple(sorted([nums[i], nums[j], nums[m]])))
                        break
                    elif t2 <= nums[m]:
                        h = m-1
                    else:
                        l = m+1
                
        
        res.remove((-1,-1,-1))
        res1 = []
        for i in res:
            res1.append(list(i))
        return res1
    
        
    
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        return self.brute_force(nums)
        # return self.hash_map(nums)
        # return self.two_pointers(nums)
        # return self.binary_search(nums)
        
