  ---------------------- Sort Colors------------------------------------------------   
# Time Complexity : O(N) N is the length of the nums.
# Space Complexity : O(1) as I am returning the same array 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I used 2 pointer approach, to sort the array and as we have only 3 types of colors, I have a low and high pointer pointing at the end of the array. 
#If I encounter 0, I am swapping with the  low pointer, if i encounter 2 , I am swapping the element with high pointer. 
#Also as we are moving forward, The element swapped with high pointer needs to check twice and If the element is 1 the we just increment the pointer.



class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        high = len(nums)-1
        i = 0
        
        while i<=high:
            if nums[i] == 0:
                nums[low], nums[i] = nums[i], nums[low]
                low +=1
                i+=1
            elif nums[i] == 2:
                nums[high], nums[i] = nums[i], nums[high]
                high -=1
            else:
                i+=1