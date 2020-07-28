# Time Complexity : O(n^2)
# Space Complexity : O(1) we are not creating any space
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        output = []
        size = len(nums)

        # if only 2 numbers we will return empty output
        if size < 3:
            return output

        # Sorting the list
        nums.sort()


        #We will iterate the list with two pointers, one starts from the low value and other starts from the high
        for i in range(0, size - 2):

        #if the element is same as previous, we will skip that element
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            low = i + 1
            high = size - 1

            #Till we reach the high, we will iterate
            while low < high:

                csum = nums[i] + nums[low] + nums[high]

                # pair found
                if csum == 0:

                    output.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # if the element is same as previous, we will skip that element
                    while low < high and nums[low] == nums[low - 1]: low += 1
                    while low < high and nums[high] == nums[high + 1]: high -= 1

                # it means the csum is less than zero, so we have to move forward towards left, so we will increase sum
                # towards zero

                elif csum < 0:

                    low += 1

                # it means the csum is greater than zero, so we have to move forward towards right, so we will reduce
                # sum towards zero
                else:

                    high -= 1

        return output
