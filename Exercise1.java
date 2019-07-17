class Solution {
    public void sortColors(int[] nums) {
        int x=0,p=0,y=nums.length-1;
        while(p<=y)
        {
            if(nums[p]==0)
            {
                int temp=nums[p];
                nums[p]=nums[x];
                nums[x]=temp;
                x++;
                p++;
            }
            else if(nums[p]==2)
            {
                int temp=nums[p];
                nums[p]=nums[y];
                nums[y]=temp;
                y--;
            }
            else{p++;}
        }
        
    }
}