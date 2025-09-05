def threeSum(self, nums: List[int]) -> List[List[int]]: #TC: O(nlogn) SC:O(1)
        nums.sort()
        n=len(nums)
        result = []
        for i in range(n):
            if i!=0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            low=i+1 
            high=n-1
            while low<high:
                target=nums[i]+nums[low]+nums[high]
                if target==0:
                    result.append([nums[i],nums[low], nums[high]])
                    low+=1
                    high-=1
                    while low<=high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1
                elif target>0:
                    high-=1
                else:
                    low+=1
        return result
