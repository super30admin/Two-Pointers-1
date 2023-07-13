//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        # Using 3 pointers, low is used to collect all 0's
        # mid is used to collect 1 and high for 2

        low = 0
        high = len(nums)-1
        mid = 0
        while mid<=high:
            if nums[mid]==2:
                nums[high],nums[mid]=nums[mid],nums[high]
                high = high-1
                #Not incrementing mid here as it has to check for 0 too
            elif nums[mid] == 1:
                mid = mid+1
            else:
                nums[low],nums[mid]=nums[mid],nums[low]
                low = low +1
                mid = mid+1
        
    
