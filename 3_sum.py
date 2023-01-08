# Time Complexity :
# O(N*M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#First, we sort the incoming array
#Then, We go through each element - for each element we pick, we find the 2 sum with the target as negative of the picked element
# We also ensure we don't have duplicates by moving to the next element until we see a new number

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        i = 0
        return_arr = []
        #print (nums)
        while i < len(nums)-1:
            prev_elem = nums[i]
            left_pointer = i + 1
            right_pointer = len(nums)-1
            curr_sum = nums[i] + nums[left_pointer] + nums[right_pointer]
            while left_pointer < right_pointer :
                prev_left_value = nums[left_pointer]
                prev_right_value = nums[right_pointer]
                if nums[left_pointer] + nums[right_pointer] == nums[i] * -1:
                    return_arr.append((nums[i],nums[left_pointer],nums[right_pointer]))
                    left_pointer += 1
                    right_pointer -= 1
                    while left_pointer < right_pointer and prev_left_value == nums[left_pointer] :
                        left_pointer += 1
                    while left_pointer < right_pointer and prev_right_value  == nums[right_pointer] :
                        right_pointer -= 1
                elif nums[left_pointer] + nums[right_pointer] < nums[i] * -1:
                    left_pointer += 1
                    while left_pointer < right_pointer and prev_left_value == nums[left_pointer] :
                        left_pointer += 1
                else :
                    right_pointer -= 1
                    while left_pointer < right_pointer and prev_right_value  == nums[right_pointer] :
                        right_pointer -= 1

            i += 1
            while i < len(nums) and nums[i] == prev_elem:
                i += 1
        return return_arr
