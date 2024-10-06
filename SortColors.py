# Time Complexity : 𝑂(𝑛) where 𝑛 is the number of elements in nums, as each element is processed once.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach 

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #Initialise the required variables
        n = len(nums)
        low=0
        mid=0
        high=n-1
        #By the time mid pointer crosses high, The colors should be sorted
        while(mid<=high):
            #Check if mid point to number 2, if yes, swap mid with high and decrement high
            if(nums[mid]==2):
                self.swap(nums,mid,high)
                high-=1
            #Check if mid pointer points to number 0, If yes, swap low with mid and increment low and mid
            elif(nums[mid]==0):
                self.swap(nums,mid,low)
                low+=1
                mid+=1
            #Check if mid pointer points to number 1, If yes, then increment mid pointer
            else:
                mid+=1
    #Function to swap two numbers
    def swap(self, nums, i, j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
