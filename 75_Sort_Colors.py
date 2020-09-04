# Leetcode link : https://leetcode.com/problems/sort-colors/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
    Brute force approach => Counter array to keep track of each color count and then populate based on count in second pass
    
   Two pointers => First pointer keeps track of the index to be updated with next zero (rightmost from the starting)
   Second pointer will keep track of index to be updated with next two (leftmost from the end)
   If we encounter 1 then we leave it as it is
   Current pointer will be used to traverse the array till it crosses the second pointer as all the elements will be just 2 after that or end of array
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # edge case
        if not nums or len(nums) == 0:
            return
        
        # intialize first pointer to 0 as the next 0 should be updated here
        zero = 0
        # intialize second pointer to last index as next incoming 2 should be udpated at last index
        two = len(nums) - 1
        
        # current pointer is initialized to start of array
        curr = zero
        
        # traverse till we reach first index containing two as rest f the elements will be two or end of array
        while ( curr <= two):
            # if current element is 2, swap with the index pointing to zero
            if nums[curr] == 0:
                nums[curr], nums[zero] = nums[zero], nums[curr]
                # increment current as we need to check next element, also increase zero index pointer
                zero += 1
                curr += 1
            # if current element is 2, swap with index pointing to two and update the pointer for two
            elif nums[curr] == 2:
                nums[curr], nums[two] = nums[two], nums[curr]
                two -= 1
            # in case of 1 do nothing and keep traversing
            else:
                curr += 1
    
    def swap(self,nums,i,j):
        nums[i], nums[j] = nums[j], nums[i]
                