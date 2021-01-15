# // Time Complexity : O(n)==> outer loop + O(logn)==>binary search
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
	# Sort the list
	# Choose a number and do a two sum on the right of the number to find the other two numbers
	# Perform the same operation for all the numbers in the list


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        if not nums:
            return res
        
        nums.sort()
        for outside in range(len(nums) - 2):
            if nums[outside] > 0 : break
            if outside > 0 and nums[outside] == nums[outside-1] :
                continue
                
            low = outside + 1
            high = len(nums) - 1
            
            while (low < high):
                sum = nums[low] + nums[high] + nums[outside]
                if sum == 0:
                    res.append([nums[outside],nums[low],nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
                elif sum > 0:
                    high -= 1
                else:
                    low += 1
        return res