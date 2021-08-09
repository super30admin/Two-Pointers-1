
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
/*Approach
1) for sorting colors determined by 0,1 and 2 respectively we can use the 3 pointers approach
2) low, mid and high 
3) low and mid starting from 0 and high put to nums.length-1 position. now we just have 3 colors, thus we know that we can have just 3 values for mid 
4) When mid ==1 we know mid is at correct position -> as number1 we want in center. thus we increment mid as mid starts from 0 and not from (high-low)/2
5) when mid ==0, we need to swap low and mid 
6) when mid ==2, we swap high and mid and decrement high as we do not want high swapping the same element 
[1,0,2,1,0,2]
in this case if mid and high both point at 2, we would swap 2,2 and end up keeping the 2 same if we increment mid, thus we do not increment mid in any case when we swap(mid and high)
 

*/

class sortColors {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0)
        {
            return;
        }
        
        int low=0,mid =0,high = nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
                
            }
            else if(nums[mid]==2)
            {
                
                swap(nums,mid,high);
                high--;
                
            }
            
            
        }
    }
    
    public void swap(int nums[],int idx1,int idx2)
    {
        int temp= nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
        
    }
}