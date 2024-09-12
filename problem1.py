"""
Time: O(nlogn)
Space: O(1)
Leet: Accepted
Problems: Did not know of two pointer approach for this problem
"""


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        self.quicksort(nums,0,len(nums)-1)
        return nums

    def quicksort(self,arr,first,last):
        if first<last:
            pindex = self.partition(arr,first,last)
            self.quicksort(arr,first,pindex-1)
            self.quicksort(arr,pindex+1,last)

    def partition(self,arr,start,end):
        pivot = arr[end]
        pindex = start

        for i in range(start,end):
            if arr[i]<=pivot:
                arr[i],arr[pindex] = arr[pindex],arr[i]
                pindex += 1
        arr[pindex],arr[end] = arr[end],arr[pindex]
        return pindex
