// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class SortColors{
    public static void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        // Low pointer collects all 0's and high pointer collect all 2's
        int low = 0, high = nums.length - 1, curr = 0;
        
        while(curr <= high){
            // If the number is 1, then we just increment the curr pointer.
            if(nums[curr] == 1){
                curr++;
            // If the number is 0, then we swap the current value with low pointer.
            // Increment the low and curr pointer.
            }else if(nums[curr] == 0){
                swap(nums, curr, low);
                low++;
                curr++;
            // If the number is 2, then we swap the current value with high pointer.
            // decrement the high pointer.
            }else{
                swap(nums, curr, high);
                high--;
            }
        }
    }
    
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printArr(int[] nums){
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,0,2,1,1,0};
        sortColors(input);
        printArr(input);

        input = new int[]{2,0,1};
        sortColors(input);
        printArr(input);

        input = new int[]{0};
        sortColors(input);
        printArr(input);

        input = new int[]{1};
        sortColors(input);
        printArr(input);
    }
}