public class Solution {
    public void SortColors(int[] nums) {
        
        int prev =0;
        int curr =0;
        int next = nums.Length-1;
        int tmp;
        
        while(curr<=next)
        {
            if(nums[curr]==0)
            {
                tmp = nums[prev];
                nums[prev++] = nums[curr];
                nums[curr++] = tmp;
            }
            else if(nums[curr]==2)
            {
                tmp = nums[curr];
                nums[curr] = nums[next];
                nums[next--] = tmp;
            }
            else{
                curr++;
            }
        }
        
    }
}
