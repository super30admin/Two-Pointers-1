# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        result=[]
        for i in range(len(nums)):
            
            if nums[abs(nums[i])-1]>0:
                nums[abs(nums[i])-1]*=-1
        for i in range(len(nums)):
            if nums[i]<0:
                nums[i]*=-1
            else:
                result.append(i+1)
        return result
                