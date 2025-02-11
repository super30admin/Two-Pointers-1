// Overall Time Complexity : O(n) . The n is number of elements in the array.
// Overall Space Complexity : O(1) . There is no extra space used for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


//The solution is to use three pointers (left, mid, right) to partition the array in a single pass.  
//The basic rule is to move the 0's to left , keep the 1's in the middle and al the 2's to the right.
public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while(mid <=right){
            
            if(nums[mid] == 2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid] == 1){
                mid++;
                
            }
            else{
                swap(nums,mid,left);
                mid++;
                left++;
            }
        }
        
    }
    public void swap(int []nums, int first , int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second] = temp;
    }
    
}
