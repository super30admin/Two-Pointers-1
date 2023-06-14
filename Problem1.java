package TwoPointers1;
/**
 * 
 * Sorted using Dutch national flag algo
 * 
 * Time Complexity :
 * O(n) as we go to every element atleast once
 *  
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem1 {
	
	public void sortColors(int[] arr) {

		if (arr.length > 1) {
			int low = 0;
			int mid = 0;
			int high = arr.length - 1;

			while (mid <= high) {
				if (arr[mid] == 0) {
					swap(arr, mid, low);
					low++;
					mid++;
				}

				if (mid <= arr.length - 1 && arr[mid] == 1)
					mid++;

				if (mid <= arr.length - 1 && high >= 0 && arr[mid] == 2 && mid <= high) {
					swap(arr, mid, high);
					high--;
				}

			}
		}
	}

	private void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
