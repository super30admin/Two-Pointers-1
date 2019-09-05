class Solution:
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
#       Starting with answer as set to store only unique triplet
        res = set()
        
#       If length is less than 3 than we can't create triplet
        if len(nums) < 3:
            return res
#       Sorting the number because, sorting time complexity: O(n) and algorithm takes more than that time complexity.
        nums.sort()
#       Running the loop and skipping last two elements.
        for i in range(len(nums)-2):
#           if smallest element is more than 0, we can't reach 0.
            if nums[i] > 0:
                break
                
#           Initializing left and right element. left element is one element right to i. Right element is last element in nums.
            left = i + 1
            right = len(nums) - 1
    
#           Running till left is less than right
            while left < right:
#               counting total of three elements
                total = nums[left] + nums[right] + nums[i]
#               If total is zero than we will append the answer
                if  total == 0:
                    res.add((nums[left], nums[right], nums[i]))
#                   Increase left and decrese right. (Founding another pair that makes 0 with element i)
                    left += 1
                    right -= 1
#               if the sum is less than 0 we want to increase our total by increasing left by 1
                elif total < 0:
                    left +=1
#               if the sum is greater than 0 we want to decrease our total by decreasing right by 1
                else:
                    right -= 1
#       converting set to list before return
        return list(res)
            
             