//Time complexity-O(n)
//Space-O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null|nums.length==0)
        {
            return;
        }
        int cur=0;
        int l=0;
        int r=nums.length-1;
        while(cur<=r)
        {
            if(nums[cur]==0)
            {
                swap(l,cur,nums);
                cur++;
                l++;
            }
            else if(nums[cur]==1)
            {
                cur++;
            }
            else{
                swap(cur,r,nums);
                r--;
            }
        }
        
    }
    void swap(int i,int j,int[]nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}