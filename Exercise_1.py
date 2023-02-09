#Time Complexity : O(N), N being the length of the array. 
#Space Complexity : O(1), because inplace. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : I had no idea how to do it at first if saving
#the count of each variable wasn't allowed. Even after completing it, I still wasn't sure
#about the solution. 

#Your code here along with comments explaining your approach in three sentences only
'''Start with low and mid pointer at 0 and high pointer at the end. Then if mid is 2, 
swap mid with high so that high is pointing at 2 and decrement high. If mid is pointing
at 0, swap low and high so that low is pointing at 1 and increment lower pointers; 
incrememt mid if equal to 1. 
'''
class Solution:
    def swap(self, nums, i , j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return []
        else:
            low = 0
            mid = 0 
            high = len(nums)-1
            #while low<high and mid<=high, implement logic and increment/decrement. 
            while(low<high and mid<=high):
                if nums[mid]==2:
                    self.swap(nums, mid, high)
                    high = high-1
                elif nums[mid]==0:
                    self.swap(nums, mid, low)
                    low = low+1
                    mid = mid+1
                else:
                    #nums[mid]==1
                    mid = mid+1