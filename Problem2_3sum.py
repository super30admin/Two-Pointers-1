'''we will use the two pointer solution as it is the most otimal solution.
    time complexity : O(n^2)
    space complexity : O(1)
'''

'''
In this approach we fix our outside pointer that is 'i' in this problem and then we do a two sum solution on the rest of the array, so to find a pair we will add hums[i] + nums[low] + nums[high] and output all the pairs with target = 0
'''
'''
Terminate when low = high ( bothe pointers at same index)
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = list()
        # null case
        if (nums == None or len(nums) == 0):
            return result
        n = len(nums)
        nums.sort()
        for i in range(n - 2):
            # we need to handle the outside duplicacy, so we just check if the next element is same or not
            if (i > 0 and (nums[i] == nums[i - 1])):
                continue
            if (nums[i] > 0):
                break

            # as low starts after the i , increament to get closer to the target when it is bigger
            low = i + 1
            # till the end of the array, decrement to get closer to the target if it is smaller
            high = n - 1

            while (low < high):
                total = nums[i] + nums[low] + nums[high]
                if (total == 0):
                    # the pair is formed
                    temp = list([nums[i], nums[low], nums[high]])
                    result.append(temp)
                    # whenever we find a pair
                    low += 1
                    high -= 1
                    # internal duplicacy, chech if the next number is same

                    while (low < high and nums[low] == nums[low - 1]):
                        low += 1

                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1

                elif (total > 0):
                    # target is bigger
                    high -= 1

                else:
                    # target is smaller
                    low += 1
        return result