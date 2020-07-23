/**
Problem: Sort Colors
Time Complexity : O(n), where n is the length of the nums array
Space complexity : O(1)

Did the code run on LeetCode: Yes

Approach 1 : O(n), multiple passes
1. Iterate thru the array and count the number of 0s, 1s, and 2s
2. Now, iterate again thru the array as many number of times as there are 0s(count of 0s), and update the existing nums array to 0's.
3. Similarly, do it for 1's and 2's.

Approah 2: O(n), single pass solution - Using 3 pointers.
1. Use three pointers low, mid and high, with low pointing to first element, mid to the next element, and high to the last element
2. We don't make any comparisons here, as we know that there are only 3 colors. 
3. So if mid points to 0, we swap it with low, and increment both low and mid.
4. If mid points to 1, we swap it with high, and decrement high. In the end we'll be left with a sorted array.


*/
// Approach 1 : Count the number of 0s, 1s, 2s  
class Solution {
    public void sortColors(int[] nums) {          
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) count_0++;
            else if(nums[i] == 1) count_1++;
            else count_2++;
        }
        //System.out.println(count_0 + " " +count_1+" "+count_2);
        for(int i = 0 ; i < count_0; i++) {
            nums[i] = 0;
        }
        for(int i = count_0; i < count_0 + count_1; i++) {
            nums[i] = 1;
        }
        for(int i = count_0 + count_1; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}       

//Approach 2: 3-pointer 
class Solution {
    public void sortColors(int[] nums) {       
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 0) {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    private void swap(int[] nums,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}