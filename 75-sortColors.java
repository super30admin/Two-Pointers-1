/**LC-75    [QuickSort]
 * Time Complexity : worst case: O(N^2)
 *                     Avg case: O(nlogn)
 * Space Complexity : O(1) [Applied Quicksort which is an INPLACE sorting algo]
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm: applied Quick sort
 */
package TwoPointers;

public class sortColors {

    public static int partition(int[] arr, int low, int high){ //returns the partition index

        int pivot = arr[high];
        int pIndex = low;
        for(int i = low; i < high; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex -1 );
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static void sortColors(int[] nums) {

        int n = nums.length;
        quickSort(nums, 0 , n - 1);

        for(int i: nums){

            System.out.print(i + " ");
        }

    }
    public static void main(String args[]){

        sortColors(new int[]{2, 0, 2, 1, 1, 0});

    }
}
