class Solution {
    public void sortColors(int[] nums) {
        int x=0,p=0,y=nums.length-1;
        while(p<=y)
        {
            if(nums[p]==0)
            {
                nums[p++]=nums[x];
                nums[x++]=0;
            }
            else if(nums[p]==2)
            {
                nums[p]=nums[y];
                nums[y--]=2;
            }
            else{p++;}
        }
        
    }
}