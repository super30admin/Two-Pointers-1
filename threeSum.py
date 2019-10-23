#Time Com : O(n^2)
#Unable to remove duplicate occurence


class Solution:
    def threeSum(self, nums):
        #sort the array
        nums.sort()

        output = []

        for center in range(len(nums)):
            left = 0
            right = len(nums)-1

            while left < center and center < right:
                # find the sum of the left,center and right elem
                sum = nums[left] + nums[center] + nums[right]
                # if the sum = 0, iterate to find more occurrences
                if sum == 0:
                    if (nums[left],nums[center],nums[right]) not in output:
                        output.append([nums[left],nums[center],nums[right]])
                        left += 1
                        right +=1
                # if sum < 0 , move the left to greater integer
                elif sum < 0:
                    left = left+1
                # if sum > 0, move the right to smaller integer
                elif sum > 0:
                    right = right -1
        return output

obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))
