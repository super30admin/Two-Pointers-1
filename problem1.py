"""
Space Complexity: O(1) no extra pointers
Time Complexity: O(N) -> Linear; in this problem, we have a catching pointer named mid, which catches the 2's and 0's and places them in correct positions

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        

        low = mid = 0
        high = len(nums)-1

        while mid <= high: 
            if nums[mid] == 2: 
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1

            elif nums[mid] == 0: 
                nums[mid], nums[low] = nums[low], nums[mid]
                low+=1
                mid+=1
            else: 
                mid+=1
        


