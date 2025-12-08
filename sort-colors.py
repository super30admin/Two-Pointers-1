
# Initialize an annray arr of length(nums) with 0 . Loop through nums, for each element
#  x in nums, increment the acount of arr[x]. Iterate arr and replace nums[i] with the 
#  elemts in arr with their correspnding no. of times.

# Time compleity: O(n)
# Space complexity O(1)

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        arr=[0, 0, 0]
        for i in nums:
            arr[i]=arr[i]+1
        print(arr)
        j=0
        for ind, i in enumerate(arr):
            n=j
            while j<n+i:
                nums[j]=ind
                j+=1
        return nums
        