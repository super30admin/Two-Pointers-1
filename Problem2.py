# https://leetcode.com/problems/3sum/

# Bruteforce => nested iteration
# TC: O(n^3)

# Hashset logic. Fixer element and use hashset like in two pointers. 
# TC: O(n^2)
# SC: O(n) because we are using hashset to avoid duplicates

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = set()
        n = len(nums)

        for i in range(n):
            st = 0 - nums[i]
            hs = set()
            for j in range(i+1, n):
                comp = st - nums[j]

                if comp in hs:
                    tempList = tuple(sorted([nums[i], nums[j], comp]))
                    res.add(tempList)

                hs.add(nums[j])

        return [list(t) for t in res]
    
# Optimal solution
# Sort + 2 pointers
# TC: O(n log n) + O(n^2) => O(n^2)
# SC: O(1)

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        res = []
        n = len(nums)

        for i in range(n - 2):
            j = i + 1
            k = n - 1

            if i > 0 and nums[i-1] == nums[i]:
                continue

            target = 0 - nums[i]

            while j < k and i != j and i != k and j != k:

                if nums[j] + nums[k] == target:
                    res.append((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1

                    while j > 0 and j < k and nums[j] == nums[j-1]:
                        j += 1
                    while k < n - 1 and j < k and nums[k+1] == nums[k]:
                        k -= 1
                elif nums[j] + nums[k] > target:
                    k -= 1
                elif nums[j] + nums[k] < target:
                    j += 1

        return res