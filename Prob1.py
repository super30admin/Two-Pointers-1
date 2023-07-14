# Time Complexity - O(n)
# Space Complexity - O(1)
# Did this work on Leetcode - Yes
# Explain your logic in few word-
# We have 3 different groups, so let's use 3 different pointers - low for 0, id for 1 and high for 2.
# Intially, let, low=mid=0,high=n-1. 
# If arr[mid]=2, then we want it at the end of the array aka high index, so swap arr[mid] and arr[high], high--.
# If arr[mid]=0, then we want it at the start of the array aka low index, so swap arr[mid] and arr[low], low++ and mid++.
# Else, mid++
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums)==0: return 

        low=0
        mid=0
        high=len(nums)-1
        while mid<=high:
            if nums[mid]==2: 
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1                                     
            elif nums[mid]==0:
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1              #Here, mid++ is needed since, high case is taken care, low is also taken care, so all 3 cases will be taken care off, so even mid needs to go ahead, else it end up behind low and this will mess up the logic
            else:
                mid+=1

   