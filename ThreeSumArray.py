# Time Complexity :

# O(n^2),  [O(nlogn) for sorting + O(n^2) for two pointer approach for each index in sorted array]


# Space Complexity :  
# O(1) 


# Approach:
# Two pointer approach for each index in array, after sorting the array.
# ===> Sort the array
# ===> For each index in the array, apply two pointer approach and calulcate sum
# ===> Advance the left and right pointers, based on whether sum = 0, or less than or greater than 0



class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # Two pointer approach for each index in array, after sorting the array.

        if not nums or len(nums) == 0 :
            return []

        result = []
        
        # Sort the array
        nums = sorted(nums)
        
        for i in range(0, len(nums)):
            # base case
            if i > 0 and nums[i] == nums[i-1]:
                continue

            # break if the numbers start becoming positiove, because from thereon , no combination will sum upto 0
            if nums[i] > 0:
                break
            
            left = i+1
            right = len(nums)-1

            while(left < right):  # because we need three elements, we need to keep them separate, and stop if they become equal
                currSum = nums[i] + nums[left] + nums[right]

                if currSum == 0:
                    triplet = [nums[i], nums[left], nums[right]]
                    result.append(triplet)
                    # advance left and right pointers
                    left += 1
                    right -= 1
                    # advance left
                    while (left<right and nums[left] == nums[left-1]):
                        left += 1
                    # advance right
                    while (left<right and nums[right] == nums[right+1]):
                        right -= 1

                elif currSum < 0:
                    left += 1
                
                else:
                    right -= 1

        return result