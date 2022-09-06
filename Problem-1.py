#tc: O(nlogn)
#sc: O(n)
class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # mergeSort
        def merge(left,right,nums):
            i,j,k = 0,0,0
            while(i<len(left) and j<len(right)):
                if left[i] <= right[j]:
                    nums[k] = left[i]
                    i += 1
                    k += 1
                else:
                    nums[k] = right[j]
                    j += 1
                    k += 1
            while(i<len(left)):
                nums[k] = left[i]
                i += 1
                k += 1
            while j < len(right):
                nums[k] = right[j]
                j += 1
                k += 1
        
        n = len(nums)
        if n == 1:
            return
        mid = n // 2
        left = nums[:mid]
        right = nums[mid:]
        self.sortColors(left)
        self.sortColors(right)
        merge(left,right,nums)