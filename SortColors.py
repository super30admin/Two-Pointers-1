# Time Complexity : O(n)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(arr,i,j):
            temp=arr[i]
            arr[i]=arr[j]
            arr[j]=temp
        n=len(nums)
        low = 0
        mid=0
        high = n-1
        #Let's say low collects 0's, mid collects all the 1's and high collects all the 2's
        while low<high and mid<=high:
            if nums[mid]==0:
                swap(nums,mid,low)
                low+=1 #Increment low and mid because low should not cross mid pointer
                mid+=1
            elif nums[mid]==2:
                swap(nums,mid,high)
                high-=1
            else:
                mid+=1
        return nums