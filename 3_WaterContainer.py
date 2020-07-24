def twoPointer(height):
    '''
    time complexity = O(n)
    space complexity = O(1)
    appraoch: area = distance between pointers * min value of height[pointer]
    1. consider two pointers at the ends of list
    2. if height[low]<hight[hihg] move low+=1 else move high-=1
    '''
    low=0
    high=len(height)-1
    max_area=-1
    while low<high:
        area=(high-low)*min(height[low],height[high])
        if area >= max_area:
            max_area=area
        if height[low]<height[high]:
            low+=1
        else:
            high-=1

    return max_area


height=[1,8,6,2,5,4,8,3,7]
print(twoPointer(height))