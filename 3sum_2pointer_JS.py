#Running Time Complexity: O(n^2)
#Space Complexity: Constant or O(1)
#Sucessfully Run and Compiled on leetcode 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if nums == None or len(nums)==0:
            return None
        nums.sort()
        for i in range(0,len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            low = i + 1
            
            high = len(nums)-1
            
            while low<high:
                if nums[i]+nums[low]+nums[high]==0:
                    result.append((nums[i],nums[low],nums[high]))
                    low +=1
                    high -=1
                    while (low <high and nums[low]==nums[low-1]):
                        low +=1
                    while (low < high and nums[high] == nums[high+1]):
                        high -=1
                
                elif nums[i]+nums[low]+nums[high]>0:
                    high -=1
                
                else:
                    low +=1
        return result
        