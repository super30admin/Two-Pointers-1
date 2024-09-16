# time Complexity:0(n2)
# leet code accepted
# no doubt


# explaination: we sort the arrray first. we know that a+b+c=0 is also a+b=-c (line 22,23)so we are taking three pointers a,b,c and making a at the starting index, b to a+1 index and
# c to the last index. Since we should avoid duplicate triplets we check if the pointer a, or b is pointing to the sam elements
# if the target is greater than than the sum of b and c,we increse the b if we the target is smaller we move c. If b+c=-a is satisfied,, we append those elements to the element

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []
        for a in range(0, len(nums) - 2, 1):
            if (a > 0 and nums[a] == nums[a - 1]):
                continue

            b = a + 1
            c = len(nums) - 1
            while (b < c):
                target = -nums[a]
                if (nums[b] + nums[c] == target):
                    result.append([nums[a], nums[b], nums[c]])
                    b += 1
                    c -= 1
                    while (b < c and nums[b] == nums[b - 1]):
                        b += 1
                    while (c > b and nums[c] == nums[c + 1]):
                        c -= 1
                elif (nums[b] + nums[c] > target):
                    c -= 1

                elif (nums[b] + nums[c] < target):
                    b += 1
        return result