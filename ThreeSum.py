#Time Complexity O(n square)
#Space Complexity O(1)

# Problem successfully compiled on leetcode
# No Problems faced while figuring out the logic



class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        resultList=[]
        
        for i in range(len(nums)):
            nums.sort()
            currentElement=nums[i]
            low=i+1
            high= len(nums)-1
            if(i!=0 and nums[i]==nums[i-1]):
                continue
            while(low<high):
                sum = currentElement + nums[low] + nums[high]
                if(sum==0):
                    resultList.append([currentElement,nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low< high and nums[high]==nums[high+1]):
                        high-=1
                
                elif sum>0:
                    high-=1
                else:
                    low+=1
        return resultList