#Time complexity O(n^2) and space complexity O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
#Sorting the array
        nums.sort()
        res=set()
    #Traversing the loop
        for i in range(len(nums)):
            s=i+1
            e=len(nums)-1
#Applying the binary search logic
            while s<e:
                sum = nums[i]+nums[s]+nums[e]
              
                if sum == 0:
                    res.add((nums[i],nums[s],nums[e]))
                    s+=1
                    e-=1
                elif sum < 0:
                    s+=1
                else:
                    e-=1
                i+=1  
        return res
            
