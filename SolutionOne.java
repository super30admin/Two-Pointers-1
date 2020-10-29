// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :nopes


// Your code here along with comments explaining your approach
/*Just sort using 3 pointers*/

class SolutionOne {
    public void sortColors(int[] nums) {

        if(nums==null||nums.length==0)
            return;

        if(nums.length==1)
            return;

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }

        }

    }
    void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}