# // Time Complexity :O(n2)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

# https://leetcode.com/problems/3sum/description/
# // Your code here along with comments explaining your approach

class Solution:
  """
  this uses kind of 2 pointer approach but we need to be careful about duplicates thats the reason for 1st if and last while
  """
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ret=[]
        nums.sort()

        for i in range(len(nums)):
            if i !=0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            r=len(nums)-1
            while l<r:
                total=nums[i]+nums[l]+nums[r]
                if total >0:
                    r -=1
                elif total <0:
                    l+=1
                else:
                    ret.append([nums[i],nums[l],nums[r]])
                    l += 1
                    # r-=1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1


        return ret
      class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
      """
      standard 2 pointer approach
      """
        def twoSum(nums,target,start_idx):
            #add sorted smalls
            l,h=start_idx,len(nums)-1
            ans=[]
            while(l<h):
                if nums[l]+nums[h]==target:
                    ans.append(sorted([-1*target,nums[l],nums[h]]))
                    l+=1
                    h-=1
                elif nums[l]+nums[h]>target:
                    h-=1
                else:
                    l+=1

            return ans
        n=len(nums)
        nums.sort()

        mans=set()
        for i in range(n-2):
            t=nums[i]
            ans=twoSum(nums,-1*t,i+1)
            for a in ans:
                mans.add(tuple(a))
        fans=[]
        for i in mans:
            fans.append(list(i))
        return fans
