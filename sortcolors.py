'''
Time Complexity -->
O(n)

Space Complexity -->
O(n) since we are using hashmap
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        dit = {}
        for i in nums:
            try:
                dit[i]+=1
            except:
                dit[i]=1
        index = 0
        val = 0
        #print(dit)
        while val!=3:
            try:
                v = dit[val]
                for j in range(v):
                    nums[index]=val
                    index+=1
                val+=1
            except:
                val+=1
        #print(nums)
            
            
        