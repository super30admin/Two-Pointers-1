# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Nope 


# // Your code here along with comments explaining your approach
#Code to sort the elements without using sort function or extra space
# Use 3 pointers and swap the high and low according to the mid

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums)==0 or nums==None:
            return []

        #Using 3 pointers one at the start and one at the end. Mid 
        # will traverse and sort the array
        low=0
        high=len(nums)-1
        mid=0

        while (mid<=high):
            if (nums[mid]==2):
                #swap mid with high as 2 is the highest
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
            
            elif (nums[mid]==0):
                #swap mid with low as 0 needs to be the top
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
            else:
                mid+=1
        
        return nums