"""
Time Complexity: 0(n log n) + 0(n^2)
Space Complexity: 0(1)
Approach:
    Three Pointers Approach
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        # sort the nums
        nums.sort()

        print("sorted-nums: ",nums)

        # return result
        result = []

        for i in range(0,len(nums)-2):
            
            # chk for duplicates (a)
            if i > 0 and nums[i] == nums[i-1]:
                continue

            # use two pointer approach for remainder
            lft = i + 1
            rt = len(nums) - 1

            while lft < rt:

                if nums[i] + nums[lft] + nums[rt] == 0:
                    # found
                    tmpList = [nums[i], nums[lft], nums[rt]]
                    result.append(tmpList)

                    # update pts
                    lft += 1
                    rt -= 1


                    # missed this part -- important 

                    # chk for duplicates(b)
                    while lft < rt and nums[lft] == nums[lft-1]:
                        lft +=  1
                    
                    # chk for duplicates(c)
                    while rt > lft and nums[rt] == nums[rt+1]:
                        rt -= 1
                
                elif nums[i] + nums[lft] + nums[rt] < 0:
                    # move lft
                    lft += 1

                    # chk for duplicates(b)
                    while lft < rt and nums[lft] == nums[lft-1]:
                        lft +=  1
                
                elif nums[i] + nums[lft] + nums[rt] > 0:
                    # move rt
                    rt -= 1

                    # chk for duplicates(c)
                    while rt > lft and nums[rt] == nums[rt+1]:
                        rt -= 1
            
            # end of inner iteration
        # end of for loop

        return result

