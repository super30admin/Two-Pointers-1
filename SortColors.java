//Sort array which have numbers only 0,1,2
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int i = 0;
        while(i <= high) {
            if(nums[i] == 0) {
            swap(nums,i,low);
            low++;
            i++; // Incrementing i as we are sure that we get only 1 from low
        } else if(nums[i] == 2) {
            swap(nums,i,high);
            high--; // Not incrementing i as we are not sure what value we get from high index
            } else {
                i++;
            }
        }
    }

    public void swap(int [] nums,int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}



class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int i = n-1;
        while(low <= i) {
            if(nums[i] == 0) {
            swap(nums,i,low);
            low++;
        } else if(nums[i] == 2) {
            swap(nums,i,high);
            high--;
            i--; // Decrementing i as we are sure that we only 1 from high
            } else {
                i--;
            }
        }
    }

    public void swap(int [] nums,int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}