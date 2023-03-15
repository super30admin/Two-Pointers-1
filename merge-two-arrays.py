# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# keep end pointers of both arrays and keep adding them into nums[1]
def merge(nums1, m, nums2, n) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    # p1= 0
    # p2=0
    # arr = []
    # while p1<=len(nums1)-len(nums2)-1 and p2<=len(nums2)-1:
    #     if nums1[p1] <= nums2[p2]:
    #         arr.append(nums1[p1])
    #         p1+=1
    #     else:
    #         arr.append(nums2[p2])
    #         p2+=1 
    # while p1 <= len(nums1)-len(nums2)-1:
    #     arr.append(nums1[p1])
    #     p1+=1
    # while p2 <= len(nums2)-1:
    #     arr.append(nums2[p2])
    #     p2+=1
    # print(arr)
    # for i in range(len(nums1)):
    #     nums1[i]=arr[i]
    
    p = m + n -1
    l = m - 1
    r= n - 1
    while  l >= 0 and r>=0:
        print(l,r)
        if nums2[r] >= nums1[l]:
            nums1[p] = nums2[r]
            p-=1
            r-=1
        else:
            nums1[p] = nums1[l]
            p-=1
            l-=1
    
    
    while l >= 0:
        nums1[p]=nums1[l]
        l-=1
        p-=1
    while r >= 0:
        nums1[p]=nums2[r]
        r-=1
        p-=1
    
        
nums1 = [1,2,3,0,0,0]
merge(nums1,3,[2,5,6],3)
print(nums1)