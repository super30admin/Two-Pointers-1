# Time Complexity:O(n)
# Space Complexity:O(1)
def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
    
        color_map = [0] * 3
         
        for i in range(len(nums)):  
            color_map[nums[i]] +=1
        j = 0
         
        for i in range(len(color_map)):
            for _ in range(color_map[i]):
                nums[j] = i
                j+=1