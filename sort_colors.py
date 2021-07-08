"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
- We intend to place the elements of 0 in the left half of the array 
and 2 in right half of the array, 1 acts as a boundary on left of which only 0
will be there and on right of which only 2 will be there
- Use three pointers, left(places 0 in order), right(places 2 in order),
curr is used to swap the elements from left and right to place them in right position
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        N = len(nums)
        i,j = 0,N-1
    
        start,index,end = 0,0,N-1 # start used to place 0 in right place, end used to place 2, index is current element
        
        while start < end and index <= end:
            if nums[index] == 0: #place 0 in left half of array by swapping with nums of start
                nums[index],nums[start] = nums[start],nums[index]
                start+=1
                index+=1 #increment the current pointer
            elif nums[index] == 2: #place 2 in right half of array by swapping with nums of start
                nums[end],nums[index] = nums[index],nums[end]
                end-=1
            else: # if the element is 1, then just increment the current pointer
                index+=1