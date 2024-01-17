# Time Complexity: O(N)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        if see 0 send to head
        if see 2 send to tail

        send to head = 
            track idx of true head (actual first element prior to swap)
        """
        head = 0 
        tail = len(nums) - 1

        idx = 0 
        while idx <= tail:
            if nums[idx] == 2:
                nums[idx], nums[tail] = nums[tail], nums[idx]
                tail -= 1
            elif nums[idx] == 0:
                nums[idx], nums[head] = nums[head], nums[idx]
                head += 1
                idx += 1
            else:
                idx += 1
        
        return nums

        
        
