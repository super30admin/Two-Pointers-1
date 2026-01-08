#time complexity -0(n^2) and space complexity - o(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result=[]
        nums.sort()
        n=len(nums)

        for i in range (n-2):
            if i!=0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break 
            l= i+1
            h=n-1
            while l< h :
                sum = nums[i]+nums[l]+nums[h]

                if sum== 0:
                    result.append([nums[i],nums[l],nums[h]])

                    l= l+1
                    h= h-1

                    while (l<h and nums[l]==nums[l-1]):
                        l= l+1
                    while (l<h and nums[h]==nums[h+1]):
                        h = h-1   
                elif sum <0:
                    l= l+1
                else:
                    h= h-1
        return result
                
            


        