""" Dutch National Flag Algorithm
Use 3 pointers: low = 0, mid for current, high for 2
Swap nums[mid] with nums[low] if 0, with nums[high] if 2, else just move mid
Continue till mid > high
"""
"""
Time Complexity: O(n) — Single pass
Space Complexity: O(1) — In-place sorting

"""

class sortColors:
    def sortColor(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums) - 1
        while (mid  <= high):
            if nums[mid] == 0:
                nums[low],nums[mid] = nums[mid],nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid +=1
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        
        print(nums)

if __name__=="__main__":
    obj = sortColors()
    nums = [2,0,2,1,1,0]
    obj.sortColor(nums)
