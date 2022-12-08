//Time Complexity :O(N) 
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :yes

public class SortColors {

    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0 )
            return;

            int left =0;
            int mid = 0;
            int high = nums.length-1;
        
            while(mid<=high){
                if(nums[mid]==2){
                    swap(mid,high,nums);
                    high--;
                }
                // Tricky part since left would never have 2 so always move both left and mid
                else if(nums[mid]==0){
                     swap(mid,left,nums);
                     left++;
                     mid++;
                }
                else{
                    mid++;
                }
            }
        
        
         }    
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
