// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach: In this approach we use three pointer low,high and mid. If we have 0 at mid then we push it to the left,swap with low and increment both low and mid,
//if we have 2 we push it to the right by swapping with high and we decrement high. if it is 1 we just move on.
public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
            int n= nums.length;
           int low=0;
           int high = n-1;
           int mid = 0;
           while(mid<=high){
               if(nums[mid] == 0){
                   swap(nums,mid,low);
                   mid++;
                   low++;
               }else if(nums[mid] ==2){
                   swap(nums,mid,high);
                   high--;
               }else{
                   mid++;
               }
           }
    }
    private void swap(int[] nums, int x, int y){
            if(x==y)return;
            int temp = nums[y];
            nums[y]=nums[x];
            nums[x] = temp;
        }
}
