# Time Complexity:=- O(n)
# Space Complexity:- O(1)
# Approach:- Use two pointers - onepointer-points where we should place the next 1 we find in the array, zeropointer- points to where we
# should place any 0 we find in the array. We start with zeropointer and onepointer pointing to 0th index. When we find 0 we have to swap it with the position of onepointer and then with the position of zeropointer so that we have 0->1 and increment the zero and onepointer both
# When we find 1 we have to swap it with the position of onepointer and increment onepointer to indicate where we should place the next 1
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zeropointer=0
        onepointer=0
        for i in range(len(nums)):
            # found 1 swap it with onepointer- onepointer knows where we have to place the next one, increment onepointer after that
            if nums[i]==1:
                nums[onepointer],nums[i]=nums[i],nums[onepointer]
                onepointer+=1
            if nums[i]==0:
                # found 0 swap it with onepointer- onepointer knows where we have to place the next one,swap onepointer with zeropinter
                # we have a 0 at onepointer so swap it, increment both zero and one pointer
                nums[onepointer],nums[i]=nums[i],nums[onepointer]
                nums[onepointer],nums[zeropointer]=nums[zeropointer],nums[onepointer]
                zeropointer+=1
                onepointer+=1
                
        # two pass
        # keep a count of 0s and 1s and 2s encountered till now in the array in one pass. In the next pass start placing 0 using zerocount,           one using onecount and two using 2count
        # numzeros=numone=numtwo=0
        # for i in range(len(nums)):
        #     if nums[i]==0:
        #         numzeros+=1
        #     elif nums[i]==1:
        #         numone+=1
        #     else:
        #         numtwo+=1
        # i=0
        # while(i<len(nums)):
        #     for _ in range(numzeros):
        #         nums[i]=0
        #         i+=1
        #     for _ in range(numone):
        #         nums[i]=1
        #         i+=1
        #     for _ in range(numtwo):
        #         nums[i]=2
        #         i+=1
        
            
            
        