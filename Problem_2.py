#
# @lc app=leetcode id=15 lang=python3
#
# [15] 3Sum
#

# @lc code=start
'''
Time Complexity - O(n^2)
Space Complexity - O(n) we are storing the result in a list else O(1) for the operations.

This code is working on Leetcode
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #Brute Force:
        result = []
        nums.sort()#sort the array first
        for i in range(len(nums)): #the first number
            if i>0 and nums[i] == nums[i-1]: #handling the duplicates
                continue
            low, high = i+1, len(nums)-1
            while low < high:
                threeSum = nums[i]+nums[low]+nums[high] #calculate the sum
                if threeSum > 0:
                    high-=1
                elif threeSum < 0:
                    low+=1
                else:
                    result.append([nums[i],nums[low], nums[high]])
                    low+=1
                    while nums[low] == nums[low-1] and low<high: #handle the duplicates again
                        low+=1
        return result       

    
        
# @lc code=end

