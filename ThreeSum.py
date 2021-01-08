'''
    Time Complexity:
        O(n^2) (when n = length of the given array)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Two Pointer Approach.
'''
class Solution:
    def __init__(self):
        self.target = 0
        self.nums = []
        self.result = []

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        self.nums = nums
        self.nums.sort()
        self.generate_triplets()
        return self.result


    def generate_triplets(self):
        for i in range(len(self.nums) - 2):
            if self.nums[i] > self.target:
                return

            if i > 0 and self.nums[i] == self.nums[i - 1]:
                continue

            self.find_pairs(self.nums[i], i + 1, len(self.nums) - 1)


    def find_pairs(self, first_num, low, high):
        while low < high:
            total = first_num + self.nums[low] + self.nums[high]

            if total == self.target:
                self.result.append([first_num, self.nums[low], self.nums[high]])
                low += 1
                high -= 1

                while (low < high and self.nums[low] == self.nums[low - 1]):
                    low += 1

                while (low < high and self.nums[high] == self.nums[high + 1]):
                    high -= 1

            elif total > self.target:
                high -= 1
            else:
                low += 1
