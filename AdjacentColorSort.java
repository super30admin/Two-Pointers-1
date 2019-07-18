/**
 * Idea: 
 * 1. Three pointers each for 0,1 and 2. low, mid are at start and high at end.
 * 2. If mid element is 0 swap with low, mid is 2 swap with high and update pointer accordingly.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) - no extra space
 * Leetcode: Yes
 *  */

class AdjacentColorSort {

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums){
        int low = 0; // 0
        int mid = 0; // 1
        int high = nums.length-1; // 2

        while(mid <= high){
         if(nums[mid] == 1){
            mid++;    
         }   
         else if(nums[mid] == 0){
            swap(nums, mid++, low++);
         }
         else{
            swap(nums, mid, high--);
         }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args){
        System.out.println("Adjacent Color Sort");
        AdjacentColorSort obj = new AdjacentColorSort();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);

        //System.out.println()
    }
}