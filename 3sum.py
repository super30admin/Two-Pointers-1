class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        n=len(nums)
        nums.sort()
        #print(nums)
        
        for i in range(0, n):
            #handle outer duplicacy not even considering the same elem again
            if i>0 and nums[i]==nums[i-1]: continue

            #inner partition starts from i+1 and we add first and last stuff
            l=i+1
            r=n-1

            #l<=r not this cuz both cant be same
            while l<r:
                sum= nums[i]+nums[l]+nums[r]
                if sum==0:
                    res.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1

                    #after adding the stuff into res only we're bothered by 
                    #if inner stuff is repeating

                    #checking l<r condition again cuz what if all elem run 
                    #out here itself, always check outer cond inner also
                    while nums[l]==nums[l-1] and l<r:
                        l+=1
                    while nums[r]==nums[r+1] and l<r:
                        r-=1

                #cuz right elem must be causing that (max)
                elif sum>0:
                    r-=1

                #cuz left elem must be causing that
                else:
                    l+=1

        return res
                