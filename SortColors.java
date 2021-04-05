// Time Complexity : O(nlogn)
// Space Complexity : O(n) sorting has a space complexity
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] arr) {
        Arrays.sort(arr);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1) sorting has a space complexity
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        // count the number of zeros ones and twos
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                count0++;
            }
            else if(arr[i] == 1) {
                count1++;
            }
            else if(arr[i] == 2) {
                count2++;
            }
        }
        // now put all the zeros ones and twos in the array
        for(int i=0;i<count0;i++) {
            arr[i] = 0;
        }
        for(int i=count0;i<count0 + count1; i++) {
            arr[i] = 1;
        }
        for(int i = count0 + count1; i < count0 + count1 + count2;i++) {
            arr[i] = 2;
        }
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1) sorting has a space complexity
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] arr) {
        int start = 0, end = arr.length - 1, mid = 0;
        // start should point to zero, mid should always point to 1 and end should always point to 2
        while(mid <= end) {
            if(arr[mid] == 1) {
                // arr[mid] should point to 1 so if arr[mid] == 1 increment mid
                mid++;
            }
            else if(arr[mid] == 0) {
                // arr[start] should point to 0 so swap arr[mid] and arr[start]
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                mid++;
                start++;
            }
            else if(arr[mid] == 2) {
                // arr[end] should always point to 2 so swap arr[mid] and arr[end]
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
}
