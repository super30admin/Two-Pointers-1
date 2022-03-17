#Time Complexity : O(n)
#Space Complexity : O()
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        li = []
        for i in range(0,len(nums)-1):
            if i!=0 and nums[i] == nums[i-1]:
                continue
            mid = i+1
            last = len(nums) - 1
            while mid < last:

                summ = nums[i] + nums[mid] + nums[last]

                if summ < 0:
                    mid +=1
                elif summ > 0:
                    last -=1
                else:
                    li.append([nums[i],nums[mid],nums[last]])
                    mid +=1
                    last -=1
                    while (mid < last) and nums[mid] == nums[mid-1]:
                        mid +=1
                    while (mid < last) and nums[last] == nums[last+1]:
                        last -=1
                    
        return li
            
            