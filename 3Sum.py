# // Time Complexity : O(n^2) + O(nlogn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class solution:
    def three_sum(self, nums):

        ## this is an extension of 2 pointer solution. what we need to do is that, for every element in array perform 
        ## a 2 pointer on the rest of the array. We need to sort the array before that. once we sort we also take care of outside duplicates-
        ## we see that if the previous element is same current element, if so we continue without doing anything 
        ## as this would result in duplicate answers. now we have our left and right pointers to perform 2 pointers. 
        ## we check the sum of the 3 pointer, l,r and i and see if it is 0 , then that them as a solution.
        ## to avoid inner(2 pointer duplicates) we move our left and right pointers if the previous lements were same.
        ## is sum>0 move right pointer else move left pointer. 

        ## also note that while removing inner duplicates we should check l<r because we are modifying l and r 
        ## which are the original conditions of the while loop, so we need to check them again.
        nums.sort()

        res = []

        for i in range(len(nums)):
            if i >0 and nums[i] == nums[i-1]:
                continue

            l = i+1
            r = len(nums)-1

            while l<r:
                sum  = nums[i]+nums[l]+nums[r]
                if sum == 0:
                    res.append((nums[i],nums[l],nums[r]))
                    l+=1
                    r-=1
                    while l<r and nums[l] == nums[l-1]:
                        l+=1
                    
                    while l<r and nums[r] == nums[r+1]:
                        r-=1
                
                elif sum > 0:
                    r-=1
                else:
                    l+=1
        return res
                
                
                
                
