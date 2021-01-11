// Time Complexity : O(m+n)
// Space Complexity :O(m)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : getting started


// Your code here along with comments explaining your approach
public class MergeSortedArray {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //base case
            if(nums1.length == 0 || nums2.length == 0) return;
            if(nums1 == null || nums2 == null) return;

            int count = (m + n)-1; //counter on nums1
            --m; //pointer at ends of nums1
            --n; //pointer at end of nums2

            while(m >= 0 && n >= 0){
                //check if nums1 value is greater than nums2 value and if true moves nums1 value at m to nums at count,
                //else if nums2 value is greater than nums1 value then move values
                if(nums1[m] > nums2[n]){
                    nums1[count--] = nums1[m--];
                } else {
                    nums1[count--] = nums2[n--];
                }
            }

            //case when elements in nums2 aren't copied over to nums1
            while(n >= 0){
                nums1[count--] = nums2[n--];
            }

        }
    }

}
