//time complexity: O(n)
//space complexity:O(1)
class Solution {
    public void sortColors(int[] nums) {
        int left=0;int right=nums.length-1; int mid=0;
        if(nums.length==0||nums==null) return;
        while(mid<=right) 
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,left);//all 0 are needed to be on the left 
                //if we find 0 in the middle we swap it with the 
                //left pointer value to get 0 on the left
                mid++;left++;
            }
            else if(nums[mid]==1)
            {
                mid++;   // if 1 is at the middle then we just increment 
                //the mid pointer as 1 is at the desired location
            }
            else
            {
                swap(nums,mid,right);//else we swap 2 to the right if it is 
                //found in the middle of the array
                right--;
            }
            
        }
        
    }
    private void swap(int nums[],int i,int j)
    {
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
