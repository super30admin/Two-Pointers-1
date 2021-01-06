# Time Complexity : O(n^2) at worse
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nope.


# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
        Can't think of a two pointer solution so I just sorted it with quickSort.
         - Didn't use library sort function.. NOT IN ONE PASS
        Going to have to change solution to two pointer
        """
        self.qSort(nums, 0, len(nums)-1)
    
    def qSort(self, arr, low, high):
        if low < high:
            pi = self.partition(arr,low,high)
            self.qSort(arr,low,pi-1)
            self.qSort(arr,pi+1,high)
            
    def partition(self, arr, low, high):
        pivot = arr[high]
        
        i = low - 1
        
        for j in range(low,high):
            if arr[j] < pivot:
                i += 1
                arr[i], arr[j] = arr[j], arr[i]
                
        arr[i+1], arr[high] = arr[high], arr[i+1]
        
        return i + 1