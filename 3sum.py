"""
Time complexity - O(N^2)
Space complexity - O(N)
Leetcode - Running
The approach here is to sort the given array. now iterate over the given array. mark the current index
as curr now take the -ve value of curr index as two sum. now maintain two pointers left and right. let 
left be one index ahead of curr and right index be at the last position of the array. now at every instance
of all pointers i.e left and right check if sum is equal to the value of two sum. if so they form a 3 sum
.if not then based on the condtion if sum is greater then move the right pointer since higher values are
towards right so move towards left. if sum is smaller move the left pointer since we need more greater
values to fullfill the two sum value. hence do this until the two left and right pointers meet. and after
every movement of pointers if the condtions are satisying then append the values to the output array.
"""

def threeSum(self, nums):
        res = []
        nums.sort()
        for cur_idx in range(len(nums)):
            if (cur_idx != 0) and (nums[cur_idx] == nums[cur_idx-1]):
                continue
            two_sum = -nums[cur_idx]
            left_idx = cur_idx + 1
            right_idx = len(nums) - 1
            while left_idx < right_idx:
                if nums[left_idx] + nums[right_idx] == two_sum:
                    res.append(
                        [nums[cur_idx], nums[left_idx], nums[right_idx]]
                    )
                    left_idx += 1
                    right_idx -= 1
                    while (left_idx < right_idx) and                                                            (nums[left_idx]==nums[left_idx-1]):
                        left_idx += 1
                    while (left_idx < right_idx) and (nums[right_idx] ==                                        nums[right_idx+1]):
                        right_idx -= 1
                elif nums[left_idx] + nums[right_idx] > two_sum:
                    right_idx -= 1
                else:
                    left_idx += 1
        return res