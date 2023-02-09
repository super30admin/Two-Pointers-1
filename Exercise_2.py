#Time Complexity : O(N^2), N being the length of the array. 
#Space Complexity : O(1), because no auxiliary array is created. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : I had thought I took care of duplicates, but
#I guess I didn't. So, I had to debug it and adjust for them. 

#Your code here along with comments explaining your approach in three sentences only
'''Sort the nums array and then, setting low and mid at the bottom, use two-pointer
technique with mid and high pointers. 
'''
class Solution:
    def two_pointer(self, result, low, find, nums, i, j):
        #Two pointer technique. 
        while(i<j):
            if nums[i]+nums[j]<find:
                i = i+1
            elif nums[i]+nums[j]>find:
                j = j-1
            else:
                #to take care of potential duplicates. 
                if (low, nums[i], nums[j]) not in result:
                    result.add((low, nums[i], nums[j]))
                #if equal to find, take remove some duplicates
                #and both increment and decrement
                while(i<j and nums[i]==nums[i+1]):
                    i = i+1
                while(i<j and nums[j]==nums[j-1]):
                    j = j-1
                i = i+1
                j = j-1


    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #initialize and sort nums. 
        result = set()
        low = 0
        mid = 1
        high = len(nums)-1
        nums.sort()
        #if less than 3, there are no results.
        if len(nums)<3:
            return result
        else:
            #increment low and mid and use two pointer technique with mid and high. 
            while(low<mid and mid<high):
                low_value = nums[low]
                find = 0-nums[low]
                self.two_pointer(result, low_value, find, nums, mid, high)
                low=low+1
                mid=low+1
                high=len(nums)-1
                
        return result

