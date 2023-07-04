class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        length_of_array= len(nums)
        output=[]
        for i in range(length_of_array-2):
            if(i>0 and nums[i] == nums[i-1]):
                continue
            l_pointer = i+1
            r_pointer = length_of_array-1
            while l_pointer < r_pointer:
                sum= nums[i]+nums[l_pointer]+nums[r_pointer]

                if(sum==0):
                    output.append([nums[i],nums[l_pointer],nums[r_pointer]])
                    l_pointer += 1
                    r_pointer -= 1
                    while l_pointer < r_pointer and nums[l_pointer] == nums[l_pointer-1]:
                        l_pointer += 1
                    while l_pointer < r_pointer and nums[r_pointer] == nums[r_pointer+1]:
                        r_pointer -= 1
                elif(sum < 0):
                    l_pointer += 1
                else:
                    r_pointer -= 1
        return output