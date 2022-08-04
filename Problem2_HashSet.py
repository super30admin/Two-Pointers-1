# Time complexity : O(n^2)
# Space complexity : O(n)
# Leetcode : Solved and submitted

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # hashing solution
        n = len(nums)
        seen = set()
        res = []
        comp = 0
        
        # checking if the list is 0 or less than 3, we return the result as 0
        if n == 0 or n < 3: 
            return []
        # if 3 elements, then if their sum is 0, then return the triplet
        if n == 3:
            if nums[0] + nums[1] + nums[2] == 0:
                return [nums]
              
        # we start traversing the list from first element until n-2 as we are looking for triplets
        for i in range(n-2):
                seen = set()
                # setting the target here as -nums[i]
                target = 0 - nums[i]
                # j is the internal pointer that is being traverses for each value starting from i+1 till the end of the list
                for j in range(i+1,n):
                    # calculate the complement
                    comp = target - nums[j]
                    
                    #check if the complement is present in the set, if present, then we have a triplet, make a list of those, sort them and 
                    # store in the set, which would only store if it is unique
                    if comp in seen:
                        temp = [nums[i],nums[j],comp]
                        temp.sort()
                        if temp not in res:
                            res.append(temp)
                            #while j+1 < n and nums[j] == nums[j+1]:
                             #   j+=1
                    # if not present in the hashset, then we add that element and return the resulting triplet pairs
                    seen.add(nums[j])
                    
        return res
