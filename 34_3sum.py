# June 10, 2020
# Try for better approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        # Time Complexity : O(nlogn)[sort] + O(n^2) ==>O(n^2)
        # Space Complexity : O(1)
        # Because we are using thrree pointers just to move
        # not considering the output set which also takes O(n) space

        '''
        - Since we sort the lis, moving around with three pointers becomes easy
        - Initial position of pointers : current[ start], a [ start+1 ], b [ end of array]
        - Since array is sorted, whenever total is greater than 0, we remove the greatest element out of three ( to get to zero )
        - whenever total is less than 0, we need more to get to 0, so we move a to right
        - store the result in set because all we can have multiple lists having same values adding up to give 0
        Problems:
        - Think of a set while storing
        - Think of three pointers and not two pointers because we have three elements
        - be careful while moving a and b, to not go out of bounds f or the current element,
          hence for is looping len(nums)-2 times

        '''
        '''
        - works in leet code
        '''
        res = set()
        nums.sort()
        for i in range(len(nums) - 2):  # 0 1 2 3 fro len(nums )= 6
            # print(nums[i])
            a = i + 1
            b = len(nums) - 1
            # print(a,b)
            while a < b:
                total = nums[i] + nums[a] + nums[b]  # checking if the total is 0
                if total < 0:  # this is done because list is sorted here
                    a += 1  # move to right
                elif total > 0:
                    b -= 1  # move to left
                    # print(b)
                else:
                    res.add((nums[i], nums[a], nums[b]))
                    a += 1
                    b -= 1
                # print(res)
        return res