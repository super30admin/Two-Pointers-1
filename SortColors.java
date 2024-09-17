// Brute Force: Two pass
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int ones = 0, zeroes = 0;

        for(int i: nums) {
            if(i==0) zeroes++;

            if(i==1) ones++;
        }

        for(int i=0;i<nums.length;i++) {
            if(zeroes!=0) {
                nums[i] = 0;
                zeroes--;
            } else if(ones!=0) {
                nums[i] = 1;
                ones--;
            } else {
                nums[i] = 2;
            }
        }
    }
}

// One pass
// Time Complexity : O(n)
// Space Complexity: O(1)
// class Solution {
 public void sortColors(int[] nums) {
     int cur = 0, left = 0, right = nums.length - 1;

     while(cur <= right) {
         if(nums[cur] == 0) {
             swap(nums, cur, left);
             left++;
             cur++;
         } else if(nums[cur] == 2) {
             swap(nums, cur,right);
             right--;
         } else {
             cur++;
         }

     }
 }

 public void swap(int[] nums, int n1, int n2) {
     int temp = nums[n1];
     nums[n1] = nums[n2];
     nums[n2] = temp;
 }
}