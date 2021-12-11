class Solution:
    def bruteForcethreeSum(self, nums):
        if not nums:
            return []
        result = []
        dict_ = {}
        for i in range(len(nums)-2):
            for j in range(i+1, len(nums)-1):
                for k in range(j+1, len(nums)):
                    sum_ = nums[i] + nums[j] + nums[k]
                    if sum_ == 0:
                        curr = [nums[i],  nums[j], nums[k]]
                        curr.sort()
                        if curr not in result:
                            result.append(curr)
        return result

    def threeSum(self, nums):

        # get the length of input list: nums
        length = len(nums)

        # sort input numbers, to keep the increasing order
        nums.sort()

        # container for 3 sum answer storage
        triplet_answer = list()

        # length - 2 is for the valid index i, j ,k within boundary
        # i = index for the first element such that 3 sum = nums[i] + nums[j] + nums[k] = 0
        for i in range(0, length - 2):

            # skip the repetition of the same element (the limitation of problem description)
            if i > 0 and (nums[i-1] == nums[i]):
                pass
                continue

            # j :   index for the second element such that 3 sum = nums[i] + nums[j] + nums[k] = 0
            #       start from smallest value after index i

            # k : index for the third  element such that 3 sum = nums[i] + nums[j] + nums[k] = 0
            #       start from largest value after index i
            j, k = i + 1, length - 1

            # inner loop to iterate index j, k
            while j < k:

                three_sum = nums[i] + nums[j] + nums[k]

                # check index i, j , k meets the sum value = 0 or not
                if three_sum == 0:

                    # get one triplet satisfy requirement, append to triplet_answer
                    triplet_answer.append([nums[i], nums[j], nums[k]])

                    # update index j, k for next iteration
                    j += 1
                    k -= 1

                    # skip the repetition of the same element
                    while j < k and (nums[j] == nums[j-1]):
                        j += 1

                    # skip the repetition of the same element
                    while j < k and (nums[k] == nums[k+1]):
                        k -= 1

                elif three_sum < 0:
                    # sum value is too small, make the second element larger on next iteration
                    # update index j
                    j += 1

                else:
                    # sum value is too big, make the third element smaller on next iteration
                    # update index k
                    k -= 1

        # return the container for 3 sum triplet
        return triplet_answer
