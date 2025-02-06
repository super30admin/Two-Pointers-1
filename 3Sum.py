def threeSum(nums):
    # 1. sort the array
    nums.sort()
    result = []

    for i in range(len(nums)-2):
        # skip duplicates 
        if i > 0 and nums[i] == nums[i-1]:
            continue
        
        # Two Pointers 
        left, right = i+1, len(nums)-1

        while left < right:
            total = nums[i] + nums[left] + nums[right]
            
            if total == 0:
                result.append([nums[i],nums[left],nums[right]])

                # Skip duplicate values
                while left < right and nums[left] == nums[left+1]:
                    left += 1
                while left < right and nums[right] == nums[right-1]:
                    right -= 1 
                
                left += 1
                right -= 1 

            elif total < 0: # sum is small , move left
                left +=1 
            else:
                right -= 1
    return result

                

