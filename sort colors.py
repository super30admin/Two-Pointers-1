# Time Complexity = O(n) 
# Space Complexity = O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        
        # running and left pointer starts from zero
        curr  = p0 = 0
        
        # right pointer starts from end
        p2 = len(nums) - 1
        
        # iterates until running pointer crosses p2
        while curr <= p2:
            
            # if pointer stands on value zero
            if nums[curr] == 0:
                
                # swap with left pointer
                nums[curr], nums[p0] = nums[p0], nums[curr]
                
                p0 += 1
                curr += 1
                
            elif nums[curr] == 2:
                
                # swap with left pointer
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 -= 1
                
            else:
                
                # if currnet pointer stands on value 1
                curr += 1