#Time Complexity O(N)
#Space Complexity O(N)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        data = dict()
        data[0]=0
        data[1]=0
        data[2]=0
        for x in nums:
            data[x]+=1
        
        cur = 0
        for x in [0,1,2]:
            if data[x]==0:
                continue
            for y in range(data[x]):
                nums[cur] = x
                cur+=1
                
            
        
            
       
        
