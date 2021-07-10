class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        if not nums:
            return []
        
        result = []
        nums.sort()
        
        for i in range(len(nums)):
            left = i+1
            right = len(nums) - 1
            
            if nums[i]>0: break # wont make the sum = 0 if all elements are greater than 0
            
            # outer duplicates
            if i != 0 and nums[i] == nums[i-1]: continue
            
            while left < right:
                currSum = nums[i] + nums[left] + nums[right]
                
                if currSum < 0:
                    left += 1
                elif currSum > 0:
                    right -= 1
                else:
                    lis = [nums[i], nums[left], nums[right]]
                    result.append(lis)
                    left += 1
                    right -= 1
                    
                    # inner duplicates
                    while left < right and nums[left] == nums[left-1]: left += 1
                    while left < right and nums[right] == nums[right + 1]: right -= 1
                    
        return result
        


# sorting the array first, and then iterating through it. first iterated value is pivot.
# initializing low and high and finding the negative of pivot as a target by taking two pointers
# in the rest of the array as twoSum problem
# TC: O(n^2) SC: O(1)
