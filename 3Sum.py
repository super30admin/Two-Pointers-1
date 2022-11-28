class Solution:
    """
    Time complexity - O(n^2). n - size of nums
    Space complexity - O(n) for storing triplets in result.
    """
    def two_sum(self, i, target, nums):
        x = i+1
        y = len(nums) -1
        result = []
        # 2 pointer approach for 2-Sum
        while x < y:
            if nums[x] + nums[y] == target:
                result.append((nums[x], nums[y]))
                x += 1
                y -= 1
            elif nums[x] + nums[y] > target:
                while y > x and nums[y] == nums[y-1]:
                    y -= 1
                y -= 1
            else:
                while x < y and nums[x] == nums[x+1]:
                    x += 1
                x += 1
        return result
    
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = set()
        nums.sort()
        for i,num in enumerate(nums):
            two_sum = self.two_sum(i,(0-num), nums)
            if len(two_sum) != 0:
                for two_tuple in two_sum:
                    temp_tuple= (num,) + two_tuple
                    result.add(tuple(sorted(temp_tuple)))
        result_list = []
        for tu in result:
            result_list.append(list(tu))
        return result_list
            
        
            
        