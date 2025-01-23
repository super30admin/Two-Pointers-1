def threeSum(self, nums: List[int]) -> List[List[int]]:
    result = []
    if not nums or len(nums) < 3:
        return result
    
    nums.sort()
    for i in range(len(nums) - 2):
        # Skip duplicate i
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        # If nums[i] > 0, no point continuing as array is sorted
        if nums[i] > 0:
            break
            
        left, right = i + 1, len(nums) - 1
        while left < right:
            curr_sum = nums[i] + nums[left] + nums[right]
            if curr_sum == 0:
                result.append([nums[i], nums[left], nums[right]])
                
                # Move left and skip duplicates
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                # Move right and skip duplicates
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                    
                left += 1
                right -= 1
            elif curr_sum < 0:
                left += 1
            else:
                right -= 1
                
    return resultht--;
            }
        }
    }
    return result;
}
