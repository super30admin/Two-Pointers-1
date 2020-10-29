 if nums is None or len(nums)==0:
            return
        low=0
        high=len(nums)-1
        mid=0
        while (mid<=high):
            if nums[mid]==0:
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1
            elif nums[mid]==1:
                mid+=1
            else:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
        
