//TC: O(n)
//SC: O(1)
//approach: keeping 2 pointers for separating colors, and swapping current color to its section
public class SortColors {
    public static void sortColors(int[] nums) {

        int start =0;
        int end = nums.length-1;
        int current =0;
        while(current <= end){
            if(nums[current] == 0){
                swap(nums, start, current);
                start++;
                current++;
            }
            else if(nums[current] == 1){
                current++;
            }else{
                swap(nums, end, current);
                end--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
