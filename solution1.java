// Time Complexity :O(n)
// Space Complexity :O(1) no aux space used
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class solution1 {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int left=0;
        int right=nums.length-1;
        int mid=0;
        // left tracks the next 0's position
        // mid tracks the running index
        // high tracks the next 2's position
        // used 2 pointer approach to position the numbers at correct indices
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,right,mid);
                right--;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int [] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
}
}
