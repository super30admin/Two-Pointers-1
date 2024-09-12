class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums)-1
        while(mid<=high):
            if nums[mid]==2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high-=1
            elif nums[mid] == 1:
                mid+=1
            else:
                nums[low], nums[mid] = nums[mid], nums[low]
                low+=1
                mid+=1

#time complexity - O(n), traversing through the entire list

#space complexity - O(1), as inplace modification

#all test cases passed