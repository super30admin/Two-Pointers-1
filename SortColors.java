// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use 3 pointers: left (for 0s), right (for 2s), and mid (current).
// Traverse the array:
// If nums[mid] == 0 -> swap with left, move both pointers.
// If nums[mid] == 2 -> swap with right, move only right pointer (mid stays to recheck swapped value).
// If nums[mid] == 1 -> move mid pointer.



import java.util.Arrays;

public class SortColors {
    public void solve(int[] nums){
        if(nums==null || nums.length==0){
            return;
        }
        int left=0;
        int right=nums.length-1;
        int mid=0;

        while(mid<=right){
            if(nums[mid]==2){
                swap(nums, mid, right);
                right--;

            }
            else if(nums[mid]==0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }


    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[]args){
        SortColors ob = new SortColors();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {2, 0, 1};

        ob.solve(nums1);
        ob.solve(nums2);

        System.out.println("Sort Colors: "+Arrays.toString(nums1));
        System.out.println("Sort Colros: "+Arrays.toString(nums2));

    }
    
}
