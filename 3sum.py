'''
time complexity: O(n * n)
space complexity: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if(len(nums)<3):

            return []
        #nlogn
        nums.sort()
        ans = []
        for i in range(len(nums)-2):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            low = i+1
            high= len(nums)-1
            
            while(low<high):
                sums = nums[i] + nums[low] + nums[high]
                if(sums==0):
                    arr = [nums[i],nums[low],nums[high]]
                    ans.append(arr)
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]): 
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif sums<0:
                    low+=1
                else:
                    high-=1
        return ans
        
        