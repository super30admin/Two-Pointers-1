# TC: O(n^2) [nlogn for sorting and n^2 for two nested for loops]
# SC: up to O(n) depends on the auxiliary space used by the sorting algorithm
# LeetCode: Y(https://leetcode.com/problems/3sum/)
# Approach: Sort the numbers and use 2-pointer techniques for finding a + b = -c
#           have low and high pointers at beginning of sub-array and end of sub-array respectively
#           if nums[low] + nums[high] == required sum, then mark the triplet, update low and high pointers to avoid duplication
#           if nums[low] + nums[high] is less than required sum then increment low(look for higher sum)
#           if nums[low] + nums[high] is more than required sum then decrement high(look for lower sum)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # initialize result
        triplets = []
        
        # sort the given list
        nums.sort()
        
        # loop through the sorted list
        for i in range(len(nums) - 2):
            
            # if current number is positive then no additional triplets are possible
            if nums[i] > 0:
                break
                
            # avoid duplication
            if(i > 0 and nums[i] == nums[i - 1]):
                continue
                
            # low and high pointers
            low, high = i + 1 , len(nums) - 1
            
            # loop until a valid range exists
            while low < high:
                # if a triplet is found
                if nums[low] + nums[high] == -nums[i]:
                    
                    # add the triplet to result
                    triplets.append([nums[i], nums[low], nums[high]])
                    
                    # update low
                    low += 1
                    
                    # update high
                    high -= 1
                    
                    # avoid duplication in low pointer
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                        
                    # avoid duplication in high pointer
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                        
                # if nums[low] + nums[high] is more than required sum then decrement high(look for lower sum)
                elif nums[low] + nums[high] > -nums[i]:
                    high -= 1
                    
                # if nums[low] + nums[high] is less than required sum then increment low(look for higher sum)
                else:
                    low += 1
                    
        # return result            
        return triplets
        
