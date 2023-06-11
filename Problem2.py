#Time Compelxity is: O(n^2)
#Space Complexity is: O(1)
#Program ran successfully on leet code
#No problem faced while writing the code

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #initializing the initial variables
        result=[]
        n=len(nums)
        nums=sorted(nums)

        #Looping through the given array
        for i in range(0,n-2):
            #If the value at i is greater than 0, we can break as the sum will be 0
            if(nums[i]>0):
                break
            #If the present and previous value is same, we will continue
            if(i>0 and nums[i]==nums[i-1]):
                continue
            #Internal selected left and right pointers
            left=i+1
            right=n-1

            while(left<right):
                #Calculating the sum
                sum=nums[i]+nums[left]+nums[right]
                #If the sum is 0
                if(sum==0):
                    #Creating an internal list in_li and adding the three values to the list and appending that to the result list
                    in_li=[nums[i],nums[left],nums[right]]
                    result.append(in_li)
                    left+=1
                    right-=1
                    #If the present and previous value is same, we will continue
                    while(left<right and nums[left]==nums[left-1]): left+=1
                    while(left<right and nums[right]==nums[right+1]): right-=1
                #If sum is greater than 0, we will decrement right pointer
                elif(sum>0):
                    right-=1
                #If sum is less than 0, we will decrement left pointer
                else:
                    left+=1
        #returning the final resultant array
        return result 
