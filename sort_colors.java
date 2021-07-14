class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return;
        }
        
        //3 pointers
        int start =0;
        int end = nums.length-1;
        int mid = 0;
        
        int temp=0;
        
        while(mid<=end)
        {
            //when the case is 1
            if(nums[mid] == 1)
            {
                mid++;
            }
            //when the case is 0
            else if(nums[mid]==0)
            {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            //when the case is 2
            else{
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }          
                
        }     
        
    }
}
