class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Time: O(N*N)
        # Space: O(1)

        nums.sort()
        result=set()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            left=i+1
            right=len(nums)-1
            while(left<right):
                sum_num=nums[i]+nums[left]+nums[right]
                if sum_num==0:
                    result.add((nums[i],nums[left],nums[right]))
                    left+=1
                    right-=1
                elif sum_num<0:
                    left+=1
                else:
                    right-=1
        
        return result