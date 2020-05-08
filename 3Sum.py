#Time Complexity: O(NlogN) for sorting and O(N*N) where N is inputs
# Space Complexity : 0(1)
# Failed for test case for [0,0,0] could you explain why
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) ==0 or nums == None:
            return []
        result = []
        nums.sort()   
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            low = i+1
            high = len(nums)-1
            while(low<high):
                sum = nums[i] + nums[low] + nums[high]
                    
                if sum ==0:
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1 
                    high-=1
                    while(nums[low] == nums[low-1]):
                        low+=1
                    while(nums[high]== nums[high+1] ):
                        high+=1
                elif sum > 0:
                    high-=1
                else:
                    low+=1
        return result
