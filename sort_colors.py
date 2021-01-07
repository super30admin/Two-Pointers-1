class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0 = current = 0 # We will initialize the p0 and current pointer to zero 
        p2 = len(nums) - 1

        while current <= p2:
            if nums[current] == 0:
                nums[p0], nums[current] = nums[current], nums[p0]
                p0 += 1
                current += 1
            elif nums[current] == 2: 
                nums[current], nums[p2] = nums[p2], nums[current]
                p2 -= 1
            else:
                current += 1
        
        
        
        
        
        ##############################################
        # The hash map approach
        
        # hash_map = {}
        # count = 0
        # for i in nums:
        #     if i in hash_map.keys():                
        #         hash_map[i] += 1
        #     else:
        #         hash_map[i] = 1                
        # # print(hash_map)
        # for j in range(3):
        #     value = hash_map.get(j,0) # Default value is zero
        #     for i in range(value):
        #         nums[count]=j
        #         count += 1