#Time Com : O(n)
#Space Com : O(1)
#Letcode successful
class Solution:
    def sortColors(self, nums):
        # i for traversing the array
        i = 0
        left = 0
        right = len(nums)-1
        while i <= right :
            # If curr num is 0
            if(nums[i] == 0):
                # Swap curr num and the leftmost elem
                nums[i],nums[left] = nums[left],nums[i]
                # Increment left pointer and i
                left = left + 1
                i = i+1
            # If curr num is 2
            elif(nums[i] == 2):
                # Swap curr num and the rightmost elem
                nums[i],nums[right] = nums[right],nums[i]
                # Decrement left pointer and i
                right = right -1
            # If curr num is 1 then only increment i
            elif(nums[i] ==1):
                i = i+1
        print(nums)

obj = Solution()
obj.sortColors([2,0,2,1,1,0])
