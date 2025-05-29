# Time Complexity: O(N^2), N is the number of elements in nums list
# Space Complexity: O(1) is Aux Space, O(K) is the number of unique triplets
# Did this code successfully run on Leetcode: Yes


from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # apply two pointer technique
        
        # sort the array
        nums.sort() # O(NlogN)

        result = []

        for index in range(len(nums)): # O(N)
            if nums[index] > 0:
                break
            
            if index != 0 and nums[index] == nums[index - 1]:
                continue
            
            low = index + 1
            high = len(nums) - 1

            while low < high: # O(N)
                if nums[index] + nums[low] + nums[high] == 0:
                    result.append([nums[index], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif nums[index] + nums[low] + nums[high] > 0:
                    high -= 1
                else:
                    low += 1
            

        return result
                
            