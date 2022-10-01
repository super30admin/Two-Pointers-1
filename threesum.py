'''
Time Complexity: O(n^2)
Space Complexity: O(1)
'''
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        op = []
        for i in range(0, len(nums)):
            left = i+1
            right = len(nums)-1
            if(i==0 or nums[i]!=nums[i-1]):
                while(left<len(nums) and right<len(nums) and left<right):
                    while(left!=i+1 and left<len(nums) and nums[left] == nums[left-1]):
                        left += 1
                    while(right!=len(nums)-1 and right+1<len(nums) and right>0 and nums[right]==nums[right+1]):
                        #print(right)
                        right -= 1
                    
                    if(left<right):
                        val = nums[i]+nums[left]+nums[right]
                        if(val==0):
                            op.append([nums[i], nums[left], nums[right]])
                            left += 1
                            right -= 1
                        elif(val<0):
                            left += 1
                        else:
                            right -= 1
        return op
        