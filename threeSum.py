#  brute force
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        dataStore = []
        
        for i in range(0,len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        li = [nums[i], nums[j], nums[k]]
                        li.sort()
                        if li not in dataStore:
                            dataStore.append(li)
        
        print(dataStore)

#  2 pointer with pivot
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        solution = []
        for pivot in range(len(nums)-2):
            low,high = pivot+1,len(nums)-1
            
            while low<high:
                tempSum = nums[low]+nums[high]+nums[pivot]
                if tempSum == 0:
                    if [nums[pivot],nums[low],nums[high]] not in solution:
                        solution.append([nums[pivot],nums[low],nums[high]])
                    high-=1
                    low+=1
                
                elif tempSum<0:
                    low+=1
                else:
                    high-=1
                    
        return solution
                
            
#  Approach is to use 2 pointer with pivot to run through

#  time complexity is O(n2)
