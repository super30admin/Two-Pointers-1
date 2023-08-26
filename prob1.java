// Time Complexity : O (n) 
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : while swap, the swap without temp variable failed
// in cases where the indices were same

public class prob1 {

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums){
        if(nums == null || nums.length == 0) return;
        int lo = 0; int mid = 0; int hi = nums.length - 1;
        while(mid <= hi){
            if(nums[mid] == 2){
                swap(nums, mid, hi);
                hi--;
            }else if(nums[mid] == 0){
                swap(nums, mid, lo);
                lo++; mid++;
            }else mid++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 0, 2, 0, 1};
        sortColors(nums);
        for(int num: nums){
            System.out.println(num);
        } 
    }
    
}
