# https://leetcode.com/problems/sort-colors/
# Time O(N) : Approach1: Two passes over nums of length N, Approach2: 3 pointers single pass over nums of length L
# Space O(1) : No extra space used

class Solution:
    def sortColors1(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        # Two pass brute force algorithm
        count0, count1, count2 = [0]*3
        
        for num in nums:
            if num == 0:
                count0 += 1
            elif num == 1:
                count1 += 1
            else:
                count2 += 1
                
        for i in range(len(nums)):
            if count0 > 0:
                nums[i] = 0
                count0 -= 1
            elif count1 > 0:
                nums[i] = 1
                count1 -= 1
            elif count2 > 0:
                nums[i] = 2
                count2 -= 1

    
    def sortColors2(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        # One pass: Take 3 pointers for sorting 3 numbers
        # Low pointer will collect the 0's, mid will collect 1's and high will collect 2's
        low, mid, high = 0,0, len(nums)-1
        
        while mid <= high:
            
            if nums[mid] == 1:
                mid += 1
                
            elif nums[mid] == 0:
                #swap with low
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1 # On the left it will always be 0 or 1 and 2 will already be swapped with high
                
            elif nums[mid] == 2:
                #swap with high
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1

nums = [2,0,2,1,1,0]
s = Solution()
s.sortColors1(nums)
print(nums)
nums = [2,0,2,1,1,0]
s.sortColors2(nums)
print(nums)