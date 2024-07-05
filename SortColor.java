// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

/* use mid,left and right pointers to represent each color, use mid as index and traverse the input using mid pointer
 and swapping the current element with either left or right depending on the color encountered */
public class SortColor {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length ==0) return;
        int n= nums.length;
        int l =0;
        int mid =0;
        int r = n-1;
        while(mid<=r){
            if(nums[mid]==0){
                swap(nums,mid,l);
                mid++;
                l++;
            }else if(nums[mid]==2){
                swap(nums,mid,r);
                r--;
            }else{
                mid++; 
            }
        }
        
    }

    public void swap(int[] nums,int i, int j){
            if(nums[i]!=nums[j]){
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
    }
}
