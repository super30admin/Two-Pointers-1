class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
#         3 pointers approach
        i=0
        low=0
        high=len(nums)-1
#         when value is 0 then it replces that number only 
        while(i<=high):
            if nums[i]==0:
                nums[low],nums[i]=nums[i],nums[low]
                low=low+1
                i=i+1
#                 if value is 2 then it replaces that number with high and decrement only high value
            elif nums[i]==2:
                nums[high],nums[i]=nums[i],nums[high]
                high=high-1
#                 if value is 1 then it just increment the counter of low and current index 
            else:
                i=i+1
                # low=low+1
# Time Complexity===O(n)
# Space Complexity====O(1)