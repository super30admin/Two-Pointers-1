#3sum problem by using the two pointers
#Time complexity : nlogn(for sorting if used binary serach) + n2 (for using two loops)
#Space complexity : O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #sorting the array 
        result = list()
        #sorting the given array 
        nums.sort()
        #loop will work till length of nums - 2 as loop will iterate by excluding one element 
        end = len(nums)-2
        for i in range(end):
            #removing external duplicacy
            if (i>0 and nums[i]==nums[i-1]):
                continue
            #not irrating for the elements once the number increases from targert 0
            if (nums[i]>0):
                break
            #defining the low pointer and high pointer
            low = i+1
            high = len(nums)-1
            #while loop for calculating the inner sum
            while(low<high):
                #calculating the sum 
                summation = nums[i] + nums[low] + nums[high]
                #if the summation is equal to target 
                if(summation == 0):
                    #creating array list for adding result
                    result.append([nums[i], nums[low], nums[high]])
                    low +=1
                    high -=1
                
                    #handling internal duplicacy 
                    while low < high and nums[low] == nums[low-1]:
                        low +=1
                    while low < high and nums[high] == nums[high+1]:
                        high -=1
                elif summation < 0:
                    low += 1
                    
                else:
                    high -= 1
        return result
                    
                    
                    
