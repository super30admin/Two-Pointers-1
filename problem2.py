#timecomplexityO(n log n)
#spacecomplexityO(1)
#taking one index and applying binary search in rest of the index.
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #edge case
        if nums==[] or len(nums)==0: return []
        List.sort(nums)
        low=0
        mid=0
        result=[]
        high=len(nums)-1
        for i in range(len(nums)-2):
            low=i
            if low>0 and nums[low]==nums[low-1]: continue
                
            mid=i+1
            high=len(nums)-1
            while(mid<high):
                _sum=nums[low]+nums[mid]+nums[high]
                if _sum==0:
                    result.append([nums[low],nums[mid],nums[high]])
                    mid+=1
                    high-=1
                    while mid<high and nums[mid]==nums[mid-1]:
                        mid+=1
                        
                    while mid<high and nums[high]==nums[high+1]:  
                        high-=1
                elif _sum>0:
                    high-=1
                else:
                    mid+=1
        
        return result
                