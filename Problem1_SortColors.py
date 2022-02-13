#Time Complexity: O(n)
#Space Complexity: O(1)
#LeetCode: Yes

'''
Approach: Use mid to check if 0, 1, or 2. If 0 swap with low, if 1 just increase mid, if 2 swap with
high, and decrement high.
'''
class Solution:
    def sortColors(self, nums):
        i,mid,j = 0, 0 , len(nums)-1

        while(mid<=j):
            if nums[mid] == 0:
                nums[mid], nums[i] = nums[i], nums[mid]
                mid += 1
                i += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[j] = nums[j], nums[mid]
                j -= 1
        return nums 


obj = Solution()
nums = [2,0,2,1,1,0]
print(obj.sortColors(nums))