#Time Complexity : O(N^2)
#Space Complexity : O(1)

class Solution:
        
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        index = 0
        output = []
        while(index <= len(nums)-3):
            target = -1 * nums[index]
            low = index +1
            high = len(nums)-1
            
            while(low < high):
                if(nums[low] + nums[high] == target):
                    output.append([nums[index], nums[low], nums[high]])
                    while(low < high and nums[low] == nums[low+1]):
                        low += 1
                    low += 1
                    while(low < high and nums[high] == nums[high-1]):
                            high -= 1
                    high -= 1
                elif (nums[low] + nums[high] < target):
                    low += 1
                                       
                else:
                    high -= 1
            while(index <= len(nums)-3 and nums[index] == nums[index+1]):
                index += 1
            index += 1
        return output
