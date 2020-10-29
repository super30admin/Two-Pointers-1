class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        ans = set()
                
        def twoPointer(i):
            
            low = i+1
            high = len(nums)-1
            
            while low < high:
                s = nums[i]+nums[low]+nums[high]
                if s < 0:
                    low+=1
                elif s >0:
                    high-=1
                else:
                    ans.add((nums[i],nums[low],nums[high]))
                    while low<high and nums[low]==nums[low+1]:
                        low+=1
                    low+=1
                    while low<high and nums[high]==nums[high-1]:
                        high-=1
                    high-=1
        nums.sort()
        for i in range(0,len(nums)):
            if nums[i]>0: #no elem after nums[i] if greater than 0 will give any other elem  lesser to sum up to zero
                break
            if i==0 or nums[i-1]!=nums[i]:
                twoPointer(i)
            else:
                continue
                    
        return list(ans)
                
        
#TC: nlogn +n2 -> O(n2)
#Sc: O(1)
            