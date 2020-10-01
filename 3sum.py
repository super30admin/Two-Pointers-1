class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        ans = set()
        prev = float('inf')
        for idx, val in enumerate(nums):
            if val == prev:                        # when the current value is same as prev, we donot need to search for 2 sum again.
                continue
            self.twoSum( nums[idx+1:], -val, ans )
            prev = val
        return ans
    
    def twoSum(self, nums, target, ans):
        cache = {}
        for idx, val in enumerate(nums):
            if target - val in cache:
                ans.add( (val, target - val, -target) ) 
            cache[val] = idx   
            
            
            
           
        # APPROACH : DISSOLVE INTO 2 SUM AT EACH INDEX #
        # 1. sort the numbers
        # 2. fix on one number, make target = (-1*number) and find 2 sum combination.
        # 3. repeat for all the numbers
        # 4. two pointers start and end, skip same numbers, start++ and end-- depending upon the result.
        
        #tc o(n^2) + o(nlogn) == o(n^2) , sc o(n)
        
