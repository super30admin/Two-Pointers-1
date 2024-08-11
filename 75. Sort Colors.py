## Time Complexity - O(n)
## Space Complexity - O(1)


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        left = 0
        i = 0

        right = len(nums)-1

        while (i <= right):
            if nums[i] == 0:

                temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp

                left += 1
                i += 1
                
            elif nums[i] == 2:
                temp = nums[right]
                nums[right] = nums[i]
                nums[i] = temp
                right -= 1
            
            else:
                i += 1






        

        
