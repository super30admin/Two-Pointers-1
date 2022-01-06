//Time complexity:O(n)
//Space complexity: 0(1)

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int p0=0; int p1=n-1;
       int cur=0; int temp;
        while(cur<=p1)
        {
            if(nums[cur]==0)
            {
                 temp= nums[p0];
                nums[p0++]=nums[cur];
                nums[cur++]=temp;
            }
            else if(nums[cur]==2)
            {
                 temp= nums[p1];
                nums[p1--]=nums[cur];
                nums[cur]=temp;
            }
           else cur++;
        }
    }
}