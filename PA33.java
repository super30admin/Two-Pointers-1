//Leetcode 75. Sort Colors
//Time complexity O(n)
//Space Complexity O(1)

class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        if(nums==null || nums.length==0 )
        {
            return;
        }
        int h= nums.length-1;
        while(m<=h){
            if(nums[m]==2){
                int temp = nums[h];
                nums[h]= nums[m];
                nums[m]= temp;
                h--;
            }else{
                if(nums[m]==1){
                    m++;
                }
            
            else{
                int temp = nums[l];
                nums[l]= nums[m];
                nums[m]= temp;
                m++;
                l++;
            }
        }
    }
 
    }
}