'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 75. 3 Sum

# Given an integer array nums, return all the triplets 
# [nums[i], nums[j], nums[k]] such that 
# i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

# Notice that the solution set must not contain duplicate triplets.

#-----------------
# Time Complexity: 
#-----------------
# O(N^2): Need to sort first. Then O(N^2) traversal on the array.

#------------------
# Space Complexity: 
#------------------
# O(N): Using auxiliary data structure to store sorted array

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  1008 ms (45.69 %ile)
# Space            :  17.4 MB (86.14 %ile)

from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        target = 0

        if n < 3:
            return

        elif n == 3:
            if nums[0] + nums[1] + nums[2] == target:
                result.append(nums)
            
            return result
        
        else:
            # O(Nlog(N)) to sort
            sorted_nums = sorted(nums)
            # print(f"Sorted nums: {sorted_nums}")

            i = 0
            low = i+1
            high = n-1

            # Until i reaches n-1 OR we reach the target sum, at which point,
            # we know that the triplets following that element cannot meet
            # the target, b.c. sorted nums
            while i < n and sorted_nums[i] <= target:
                # If we encounter same element at i as we did at i-1,
                # we need to skip the logic below to avoid considering the
                # same pair of elements while making the triplet

                # Don't check the condition for i==0
                # Because we will go out of bounds.
                if i == 0 or sorted_nums[i] != sorted_nums[i-1]:
                    low = i+1 #First ptr
                    high = n-1 #Second ptr

                    while low < high:
                        
                        # Candidate triplet
                        triplet = [sorted_nums[i], \
                                        sorted_nums[low], \
                                        sorted_nums[high]]
                        
                        triplet_sum = sum(triplet)

                        # print(f"triplet: {triplet}, sum: {triplet_sum}, i:{i}")

                        
                        if triplet_sum == target:
                            result.append(triplet)
                            low += 1
                            high -= 1
                            # print(f"Adding triplet: {triplet}")
                            
                            while low < high and \
                                        sorted_nums[low] == sorted_nums[low-1]:
                                low += 1

                        elif triplet_sum > 0:
                            high -= 1

                        else:
                            low +=1

                i += 1

            return result


obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4,-2,-3,3,0,4]))