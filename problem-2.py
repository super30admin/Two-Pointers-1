# Leetcode execution : YES
# Time Complexity: O(n^2)
# Space Complexity: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # no answer if length less than three 
        if len(nums)<3:
            
            return []
        
        result=[]
        # first we sort the array  
        nums.sort()
        # we are using three pointers and first pointer will be miving from 0->n-2 second from first +1 till third pointer and third pointer from n to second+1. we do this between second and thrid pointer since we have sorted the array  
        
        
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]: 
                continue
            
            low=i+1
            high=len(nums)-1
            # loop until low is less than high 
            while(low<high)
                sum1=nums[i]+nums[low]+nums[high]
                # print(sum1)
                # we get the sum we record it and move low and high one place since we dont want same index ever again 
                if sum1==0:
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    # since we dont want the values to be duplicate we move low and high until their values are different from their previous values 
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                    # sum less than 0 we move low as the array is sorted 
                elif sum1<0:
                    low+=1
                    # sum greater than 0 we move high as the array is sorted and lower values are towards left
                else:
                    high-=1
        return result
        
        