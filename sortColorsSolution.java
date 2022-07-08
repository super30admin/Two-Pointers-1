import java.util.Arrays;

public class sortColorsSolution {
    public int[] sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int lowPointer = 0;
        int midPointer = 0;
        int highPointer = nums.length - 1;

        while (midPointer <= highPointer) {
            if (nums[midPointer] == 0) {
                swap(nums, lowPointer, midPointer);
                lowPointer++;
                midPointer++;
            } else if (nums[midPointer] == 1) {
                midPointer++;
            } else {
                swap(nums, midPointer, highPointer);
                highPointer--;
            }
        }

        return nums;

    }

    public void swap(int[] nums, int firstElement, int secondElement) {
        int temp = nums[firstElement];
        nums[firstElement] = nums[secondElement];
        nums[secondElement] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColorsSolution scs = new sortColorsSolution();
        System.out.println(Arrays.toString(scs.sortColors(nums)));
    }
}
