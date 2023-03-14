# TC = O(n)
# SC = O(3) = O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        dict1 = {0: 0, 1: 0, 2: 0}
        
        for i in nums:
            dict1[i] += 1
        
        nums.clear()
        for i in dict1:
            while dict1[i] != 0:
                nums.append(i)
                dict1[i] -= 1