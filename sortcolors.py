# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Create 3 pointers low,mid and high
#Let low=mid=0 and high=n-1
#If the element at mid == 0 then swap with low element and increment low and mid pointers
#If element at mid==2 then swap mid and high elements and decrement high pointers
#If mid element ==1 then just increment mod pointer
 def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        low,mid,high=0,0,n-1

        while (mid<=high):
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
            elif nums[mid]==1:
                mid+=1
            elif nums[mid]==2:
                nums[high],nums[mid]=nums[mid],nums[high]
                high-=1
                
 