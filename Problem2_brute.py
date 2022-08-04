# Time complexity : O(n^3)
# Space complexity : O(n)
# Leetcode : Time limit exceeded

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # brute force solution 
        n = len(nums)
        
        if n == 0:
            return []
        res = []
        
        # traversing all the combinations to get the sum = 0 after adding all the 3 elements
        for i in range(n-2):
            for j in range(i+1,n-1):
                for k in range(j+1,n):
                    if (nums[i] + nums[j] + nums[k] == 0):
                        temp = [nums[i],nums[j],nums[k]]
                        # check if the triplet pair is present in the hashmap, if not then add, else jump to next pair
                        temp.sort()
                        if temp not in res:
                            res.append(temp)
        
        return res
