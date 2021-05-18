class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
         
        def twoSum(complement, index):
            start, end = index + 1, len(nums)-1
            while start < end:
                # Case 1: Current Sum == Complement Sum
                if nums[start] + nums[end] == complement:
                    result.append([nums[index], nums[start], nums[end]])
                    start += 1
                    end -= 1
                    # Two avoid duplicate triplets, skip all duplicate
                    while start < end and nums[start] == nums[start-1]:
                        start += 1
                    # Two avoid duplicate triplets, skip all duplicate                        
                    while start < end and nums[end] == nums[end+1]:
                        end -= 1
                # Case 2: Current Sum < Complement Sum                        
                elif nums[start] + nums[end] < complement:
                    start += 1
                # Case 3: Current Sum > Complement Sum                                         
                else:
                    end -= 1
        
        result = []
        nums.sort()
        
        for i in range(len(nums)-2):
            if i and nums[i] == nums[i-1]:
                continue
            complement = -nums[i]
            twoSum(complement, i)        
                               
        return result                      

### Complexity Analysis:
# Time Complexity: O(NlogN + N^2) --> Sorting + Two sum for all N elements
# Space Complexity: O(1) --> Three pointers occupy constant space