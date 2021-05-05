#Running Time complexity: O(n)
#Space Complexity: Constant or O(1)
#Run and Compiled on leetcode platform
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if nums== None or len(nums)==0:
            return None
        low = 0
        high = len(nums)-1
        mid = 0
        while mid<=high:
            if nums[mid]==0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low +=1
                mid +=1
            elif nums[mid]==2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1
            else:
                mid +=1
        return nums