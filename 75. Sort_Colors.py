#time: O(n)
#space: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n= len(nums)
        left= 0
        right = n -1
        mid= left 
        while( mid <= right):
            print(left, mid, right)
            if( nums[mid] == 2):
                nums[mid], nums[right]= nums[right], nums[mid]
                right = right -1
            elif(nums[mid] == 0):
                nums[mid], nums[left]= nums[left], nums[mid]
                left = left + 1
                mid = mid + 1
            else:
                mid = mid + 1
            print(left, mid, right)
            print(nums)
        return nums
             
        
