#Four approaches in total
#Brute force - O(n^3)
#hashmap - O(n^2)
#two pointers - O(n^2)
#binary search - O(n^2logn)
class Solution(object):
    def threeSum(self, nums):
        # arr=[]
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)):
        #         for k in range(j+1,len(nums)):
        #             if nums[i]+nums[j]+nums[k]==0 and sorted([nums[i],nums[j],nums[k]]) not in arr:
        #                 arr.append(sorted([nums[i],nums[j],nums[k]]))
        # return arr
        
        nums.sort()
        arr=[]
        #total_sum=0
        for i in range((len(nums)) - 2):
            #outer duplicates check
            if i > 0 and nums[i-1] == nums[i]:
                continue
            #Consider an element as pivot
            #Apply the two pointer approach for the remaining
            #Hence low = i + 1
            low = i+1
            high = len(nums) - 1
            
            while low<high:
                #calculate the total at each and every point
                total=nums[i]+nums[low]+nums[high]
                #if total is less than zero, move low towards right since it is sorted
                if total<0:
                    low = low + 1
                #if total is greater than zero, move high towards left since it is sorted
                elif total>0:
                    high = high - 1
                
                #total is equal to zero
                else:
                    arr.append([nums[i],nums[low],nums[high]])
                    #inner duplicates check
                    while low < high and nums[low] == nums[low + 1]:
                        low = low + 1
                    while low < high and nums[high] == nums[high-1]:
                        high = high - 1
                    low = low + 1
                    high = high - 1
        return arr
                        
        
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        