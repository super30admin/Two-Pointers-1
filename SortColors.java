// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class SortColors {
    public void sortColors(int[] nums) {
        // quickSort(nums, 0, nums.length -1);
        // helperCount(nums);
        helperOnePass(nums, nums.length);

    }

    private void helperOnePass(int[] nums, int n) {
        //Creates left, right and mid ptrs
        int l = 0;
        int r = n - 1;
        int m = 0;

        //till mid <= left keep the loop alive
        while (m <= r) {

            //if mid is Two then  swap with right ptr and decrease right ptr
            if (nums[m] == 2) {
                swap(nums, m, r);
                r--;
            //if mid is One then  swap with left ptr  and increase left ptr
            } else if(nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            //if mid is Two then  swap with right ptr and increase mid ptr
            } else {
                m++;
            }
        }
    }

    // private void helperCount(int[] nums) {
    //     int countOne = 0;
    //     int countTwo = 0;
    //     int countZero = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         switch (nums[i]) {
    //             case 1:
    //                 countOne++;
    //                 break;
    //             case 2:
    //                 countTwo++;
    //                 break;
    //             default:
    //                 countZero++;
    //                 break;
    //         }
    //     }

    //     for (int i = 0; i < countZero; i++) {
    //         nums[i] = 0;
    //     }

    //     for (int i = 0 + countZero; i < (countOne + countZero); i++) {
    //         nums[i] = 1;
    //     }

    //     for (int i = 0 + countZero + countOne; i < (countOne + countZero + countTwo); i++) {
    //         nums[i] = 2;
    //     }

    // }

    private void swap(int arr[], int i, int j) {
        if (arr[i] == arr[j]) {
            return;
        }
        arr[i] = (arr[i] & arr[j]) + (arr[i] | arr[j]);
        arr[j] = arr[i] + ~arr[j] + 1;
        arr[i] = arr[i] + ~arr[j] + 1;

        // arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

    /*
     * This function is same in both iterative and
     * recursive
     */
    // private int partition(int arr[], int l, int h) {
    //     int pivot = arr[h];
    //     int i = (l - 1);
    //     for (int j = l; j <= h - 1; j++) {
    //         if (arr[j] < pivot) {
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }

    //     swap(arr, i + 1, h);
    //     return (i + 1);
    // }

    // // Sorts arr[l..h] using iterative QuickSort
    // private void quickSort(int arr[], int l, int h) {
    //     if (l >= h) {
    //         return;
    //     }
    //     int[] stackArr = new int[h - l + 1];
    //     int top = -1;

    //     stackArr[++top] = l;
    //     stackArr[++top] = h;

    //     while (top >= 0) {
    //         h = stackArr[top--];
    //         l = stackArr[top--];

    //         int pi = partition(arr, l, h);

    //         if (pi - 1 > l) {
    //             stackArr[++top] = l;
    //             stackArr[++top] = pi - 1;
    //         }

    //         if (pi + 1 < h) {
    //             stackArr[++top] = pi + 1;
    //             stackArr[++top] = h;
    //         }
    //     }
    // }

}