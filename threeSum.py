# TC: Sorting takes O(log n ), we iterate nums once and again in while loop , so Tc=(o(log n +N^2))=O(n^2)
#SC: we used extra space res. O(n)
#Ran successfully on Leetcode:Yes
#difficulties: Doubt in SC

#Here we sort the array first
#then we use two pointers l and r to choose numbers, and ith index number as base. 
# we check if nums[i]>0, and if yes, we reject that number becasue any three postive number definetely add up to more than 0. 
#we check if the index is greater than 0 and if the numbers adjacent are same or, we continue. 
# While calcualting total sum, if the sum is greater than 0, we decrement the right  pointer as we want smaller number else we increment the left pointer. 
#Like this we check for all numbers in the array using these two pointers. 
#While considering the index i we run throught the array till last bnut two index as it would be obviou sthat lst two numbers would have been already considered(*)


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        for i in range(len(nums)-2):#(*)
            if nums[i]>0:
                break
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            r=len(nums)-1
            while l<r:
                total=nums[i]+nums[l]+nums[r]
                if total>0:
                    r-=1
                elif total<0:
                    l+=1
                else: 
                    res.append([nums[i],nums[l],nums[r]])
                    while l<r and nums[l]==nums[l+1]:#To make sure we try out different numbers
                        l+=1
                    while l<r and nums[r]==nums[r-1]:
                        r-=1
                    l+=1
                    r-=1
                    
					
        return res
# 					
