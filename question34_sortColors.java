package TwoPointers1;

public class question34_sortColors {

    /*
        Quick Sort
            Time Complexity: O(n ^ 2)
            Space Complexity: O(1)
    */
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        quickSort(nums, low, high);
    }

    private static void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int p = partitionArray(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }
    }

    private static int partitionArray(int nums[], int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low ; j < high ; j++) {
            if(nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }

    private static void print(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    /*
        Two Pointer Solution
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public static void sortColorsTwoPointer(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            } else {
                mid++;
            }
        }
    }
    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        print(nums);
        sortColorsTwoPointer(nums);
    }
}