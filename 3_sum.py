# -*- coding: utf-8 -*-
"""
TC : O(N + NlogN) N is the number of elements, O(N) for traversal and NlogN for sorting
SC : O(N) for List out_list creation to check for duplicates
"""

class Solution:
    def threeSum(self, nums: []):
        #edge case
        if len(nums) < 3:
            return []
        out=[]
        nums.sort() #sorting the array is a pre-requisite to this problem
        
        #we can have 2 pointers at opposite ends of the array and check for sum = a+b+c = 0
        #Check if sum =0, append it to the output list
        #check if sum > 0, move pointer towards left
        #check for sum <= , move pointer towards right
        for i in range(len(nums)-2):
            l = i+1 
            h = len(nums) - 1
            while l < h:
                sum = nums[i] + nums[l] + nums[h]
                if (sum == 0):
                    out_list=[]
                    out_list.append(nums[i])
                    out_list.append(nums[l])
                    out_list.append(nums[h])
                    if out_list not in out:
                        out.append(out_list)
                    #check for duplicates in array then move both pointers
                    l += 1  
                    h -= 1
                elif (sum > 0):
                    h = h-1
                elif (sum < 0):
                    l = l+1 
        return out
        
S = Solution()
nums = [-1,0,1,2,-1,2,0,2,-4,-4,-4,-1,-1,-1,-4,0,3,3,3,3,7]
print(S.threeSum(nums))