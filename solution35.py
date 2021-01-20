#Time Complexity:O(n^2)
#Space Complexity:O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result=[]                                                  #declaring a output array
        if(len(nums)==0):                                          #if input is null return null array
            return result
        temp=pow(-10,6)                                             #assigning temp to record the previous element
        nums.sort()                                                 #Sort the input array 
        for elem in nums:                                           #for every element in the input array
            if elem>0:                                              #if element is greater than zero(target) break
                    break
            if elem==temp:                                          #if an element is same as previous element skip
                continue
            low=nums.index(elem)+1                                  #assign low pointer to the next element of current element
            high=len(nums)-1                                        #assign high pointer to the last element of the array
            while(low<high):                                        #while low pointer is before the high pointer
                s=elem+nums[low]+nums[high]                         # find sum of current element, low pointer element and high pointer element
                if(s==0):                                           #if the sum is equal to 0
                    result.append([elem,nums[low],nums[high]])      #append the three elements to as a list to the output array
                    low+=1                                          #increment the low pointer 
                    high-=1                                         #decrement the high pointer
                    while(low<high and nums[low]==nums[low-1]):     #increment the low pointer until duplicate elements are skipped
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):   #decrement high pointer until duplicate elements are skipped
                        high-=1
                elif(s>0):                                          #if sum is greater than 0 decrement the high pointer
                    high-=1
                else:
                    low+=1                                          #if sum is lower than 0 increment the low pointer
            temp=elem                                               #assign the current element to temp to record the previous element
        return result                                               #return the final output array