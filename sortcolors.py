'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swapnum(i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            return nums
        
        high = len(nums)-1
        low = mid = 0
        while(mid<=high):
            if(nums[mid]==2):
                nums = swapnum(mid, high)
                high -= 1
            elif(nums[mid]==0):
                nums = swapnum(low, mid)
                mid +=1
                low +=1
            else:
                mid +=1
        return nums
                
        