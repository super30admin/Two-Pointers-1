// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Using three pointer approach, take low and mid at 0th index and right pointer at N-1 index
// if mid==2, swap it to the right pointer, if mid==0, swap it to the low pointer
// after multiple iterations, when m > r the array is sorted 

public class Problem1_SortColors {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0, m=0, r=n-1;
        while(m<=r){
            if(nums[m]==2){
                swap(nums, m, r);
                r--;
            }else if(nums[m]==0){
                swap(nums, l, m);
                l++;
                m++;
            }else{
                m++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
