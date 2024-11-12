# TC: O(n^2)
# SC: O(1)

def threeSum(nums):
        ans = set()
        nums.sort()
        for idx in range(len(nums)):
            i = idx + 1
            j = len(nums) - 1
            while i < j:
                if i == idx:
                    i += 1
                    continue
                elif nums[idx] + nums[i] + nums[j] > 0:
                    j -= 1 
                elif nums[idx] + nums[i] + nums[j] < 0:
                    i +=1
                else:
                    ans.add((nums[idx], nums[i], nums[j]))
                    i +=1
                    j -=1
        return list(ans)


a = [-1,0,1,2,-1,-4]
print(threeSum(a))