# // Time Complexity :o(n^2)
# // Space Complexity : varies from O(logn) to O(n), depending on the implementation of the sorting algorithm
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no
class Solution:
    def threeSum(self, nums):
        
        #sort the array
        nums.sort()
        #res will return list of lists
        res=[]

        for i,v in enumerate(nums):
            #we have to check that this element should not be duplicate and continue if true
            if i >0 and v==nums[i-1]:
                continue
                #now find other two elements
            l=i+1
            r=len(nums)-1
            while l<r:
                cursum= v+nums[l]+nums[r]
                
                if cursum<0:
                  
                    l=l+1
                elif cursum>0:
               
                    r=r-1
                else:
               
                    res.append([v,nums[l],nums[r]])
                    l=l+1
       
#            Handling Duplicates in other 2 eleme
# Say index l and r are forming a solution in a sorted array. Now givens nums[l], there is a unique nums[r] such that nums[l]+nums[r]=Target(v here). Therefore, if nums[l+1] is the same as nums[l], then searching in range l+1 to r will give us a duplicate solution. Thus we must move l till nums[l] != nums[l-1] to avoid getting duplicates.      
                    while l<r and nums[l]==nums[l-1]:
                        l=l+1
        return res
                    