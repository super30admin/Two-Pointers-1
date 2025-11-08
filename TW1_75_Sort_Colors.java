/**** Method 1 ****/
//Time Complexity: O(NlogN)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//Sort the array.

/**** Method 2 ****/
//Time Complexity: O(2N)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// Count Sort, Traverse the array and store the count of 0's,1's and 2's. Now start inserting the values into the array,in the order of 0,1 and 2.

/**** Method 3 ****/
//Time Complexity: O(Log(m+n))
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// Take three pointers, i = 0, j = 1 and k = arr.length - 1, now traverse the array while(j < k), if ele is 0 then swap it with i and i++, j++, else if ele is 1 then just j++ else ele is 2 then swap it with k and do k--, at end return the arr.

import java.util.Arrays;

public class TW1_75_Sort_Colors {

  public void sortColors(int[] nums) {
    Arrays.sort(nums);
  }

  public void sortColors1(int[] nums) {
    int countZeros = 0;
    int countOnes = 0;
    int countTwos = 0;

    for (int i : nums) {
      if (i == 0) {
        countZeros++;
      } else if (i == 1) {
        countOnes++;
      } else {
        countTwos++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (countZeros > 0) {
        nums[i] = 0;
        countZeros--;
      } else if (countOnes > 0) {
        nums[i] = 1;
        countOnes--;
      } else {
        nums[i] = 2;
        countTwos--;
      }
    }
  }

  public void sortColors2(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int mid = 0;

    while (mid <= right) {
      if (nums[mid] == 0) {
        swap(left, mid, nums);
        left++;
        mid++;
      } else if (nums[mid] == 2) {
        swap(right, mid, nums);
        right--;
      } else {
        mid++;
      }
    }
  }

  private void swap(int i, int j, int[] nums) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
