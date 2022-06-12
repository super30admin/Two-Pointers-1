#  Time Complexity : O(n)
#  Space Complexity : O(1)


class Solution:
    def sortColors(self, nums):
        if nums == None or len(nums) == 0:
            return
        # collect all 0s.
        low = 0
        # collect all 1s.
        mid = 0
        # collect all 2s.
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums,low,mid)
                low = low + 1
                mid = mid + 1
            elif nums[mid] == 2:
                self.swap(nums,high, mid)
                high = high -1
            else:
                mid = mid + 1
        return nums
            
    def swap(self,nums,i,j):
        tempt = nums[i]
        nums[i] = nums[j]
        nums[j] = tempt          

obj = Solution()
print(obj.sortColors([2,0,2,1,1,0]))


