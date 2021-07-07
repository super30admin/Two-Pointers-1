# Runs on Leetcode
# Runtime complexity:    O(n * logn). --where n is the size of list
# Memory complexity:     O(1)


'''
1)  Sort the list first.

2)  Iterating through the list with pointers i, left and right where left is i+1 and right is at last point of the list. Sum of 
elements at indexes i, left and right is chceked and if the sum is less than 0, left will be  incremented. If the sum is 
greater than zero right pointer will be decremented.

3)  While incrementing left and decreasing right we check if succesive values are same. If they are same we keep incrementing
and decrementing them respectively till we get different values.
'''

class Solution:
    def threeSum(self, nums):
        if not nums:
            return []
        nums.sort()
        
        result = set()
        for i in range(len(nums)-2):
            left = i+1
            right = len(nums)-1
            while(left < right):
                Sum = nums[i] + nums[left] + nums[right]
                if Sum<0:
                    left += 1
                elif Sum>0:
                    right -= 1
                else:
                    result.add((nums[i],nums[left],nums[right]))
                    while left < right and nums[left] == nums[left+1]:
                        left += 1
                    while left < right and nums[right] == nums[right-1]:
                        right -= 1
                    left += 1
                    right -= 1
        
        result = list(result)
        result = [list(elem) for elem in result]
        return result
