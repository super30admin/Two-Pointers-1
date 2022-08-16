"""
Time Complexity : inside function
Space Complexity : inside function
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Problem1 (https://leetcode.com/problems/sort-colors/)

"""

# Approach  - 1
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        Using own sort function (quick sort).
        Time Complexity : O(nlogn)
        Space Complexity : O(n)
        """
        
        return self.quickSort(nums, 0, len(nums) - 1)
    
    def quickSort(self,arr,low,high):
        if arr == []:
            return 

        if low < high:
            # the right partitioned index
            x  = self.partition(arr, low, high)
            # left side of the pivot recursive call
            self.quickSort(arr, low, x-1)
            # Right side of the pivot recursive call
            self.quickSort(arr,x+1, high)
        
    def partition(self,arr,low,high):
   
        i = low -1
        pivot = arr[high]

        for j in range(low, high):
            if arr[j] < pivot:
                i+=1
                #swap the elemets at j and i

                (arr[i],arr[j]) = (arr[j], arr[i])
        #swap the pivot item with the greater item specified by i
        (arr[i+1], arr[high]) = (arr[high], arr[i+1])

        return i+1
  
# Approach - 2
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        In this we will be using two pointer approach, taking three pointer low, mid and high.
        Time Complexity : O(n)
        Space Complexity : O(1)

        """
        if len(nums) == 0: return 0
        
        l,h = 0, len(nums) - 1
        mid = 0
        while mid <= h:
            if nums[mid]==2:
                nums[mid],nums[h] = nums[h], nums[mid]
                h -=1
            elif (nums[mid] ==0):  
                nums[mid],nums[l] = nums[l], nums[mid]
                l += 1
                mid += 1
            elif (nums[mid]==1):
                mid += 1