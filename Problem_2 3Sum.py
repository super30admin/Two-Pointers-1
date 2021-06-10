# // Time Complexity : O(n2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if nums == None or len(nums) == 0:
            return
        nums.sort()
        n = len(nums)
        for i in range(n):
            # pivot is i here
            if(i!=0 and nums[i] == nums[i-1]):    #for duplicates
                continue
            if nums[i]>0:   # Check Sorted array
                break
            low = i + 1
            high = n - 1
            while low < high:
                sum = nums[i] + nums[low] +nums[high]
                if sum == 0:  # Triplet found
                    list1 = [nums[i], nums[low], nums[high]]
                    result.append(list1) # add it to array
                    low += 1  #Increment low pointer
                    high -= 1 # Decrement high pointer
                    while low<high and nums[low] == nums[low - 1]:  #Duplicates Check
                        low += 1
                    while low<high and nums[high] == nums[high + 1]: #Duplicates Check
                        high -= 1
                elif sum > 0:
                    high -= 1
                else:
                    low +=1
        return result



