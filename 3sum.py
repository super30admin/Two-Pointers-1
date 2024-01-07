
#https://leetcode.com/problems/3sum/
#Time comp: O(n^2) + O(logn) 
  #logn for sorting the list 
  #n^2 as we call n elements and perform 2sum logic n time 
#space comp: O(n)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result =[]
      
        nums.sort()
       # print(nums)
        for i in range(len(nums)):
            if nums[i] >0:
            #no point if we don't have -ve values we can never have a sum of 0
            #so just break out
                break
            if i==0 or nums[i-1] != nums[i]:
                self.sum3(nums, i, result)
        return result

    def sum3(self, nums: List[int], i: int, result: List[List[int]]):
        low = i+1
        high = len(nums)-1
        while(low < high):
            sum = nums[i]+nums[low] + nums[high]
            #print(sum)
            if(sum <0):
                low +=1

            elif(sum> 0):
                high-=1
            else:
                result.append([nums[i], nums[low], nums[high]])
                #print(result)
                # result.append(result1)
                low +=1
                high -=1
                #to handle duplicates numbers in the sorted array, we
                #incremenet low and move to the next one. 
                while low < high and nums[low] == nums[low-1]:
                    low+=1
                

      

            
