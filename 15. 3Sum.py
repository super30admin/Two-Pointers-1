
## T - O(n^2)
## S - O(1). i.e. using output array

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        arr = []

        nums.sort()

        for i, n in enumerate(nums):

            if i > 0 and nums[i-1] == n:
                continue
            
            else:

                left, right = i + 1, len(nums) -1

                while(left < right):
                    threeSum = n + nums[left] + nums[right]

                    if(threeSum > 0):
                        right -= 1
                    elif threeSum < 0:
                        left +=1
                    
                    else:
                        arr.append([n, nums[left], nums[right]])
                        ## we got one of our resulting array, we need to find remaining
                        ## keep moving left pointer
                        left += 1

                        ## in case we hit repeating values while moving pointers
                        ## if we don't have this check, our loop will keep iterating
                        ## and pick up duplicate values
                        while nums[left] == nums[left-1] and left < right:
                            left += 1
        
        return arr




        
