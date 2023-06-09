// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*compare the p1 and p2. whichever value is larger place it at the end of array1 and decrement the pointer which had larger value and pointer p3.
continue until you reach end of array.
 * 
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) return; // valid because first array contains everything
        int p1 = m-1; //pointer at end of nums1 before 0's as its considered as placeholder
        int p2 =  n-1 ; //pointer at last index of nums2
        int p3 = (m+n)-1; // pointer at end of nums1 which includes 0's m+n
        if(m==0) {
         nums1[m] = nums2[0];
        }
        while(p1 >= 0 && p2 >= 0){
            
            if(nums1[p1]>=nums2[p2]){
             nums1[p3] = nums1[p1];
             p1--;
            }
            else {
                 nums1[p3] = nums2[p2];
                 p2--;

            }
        p3--;

            }
            //copy the left out elements in p2 to p3
            while(p2>=0){
                nums1[p3]= nums2[p2];
                p2--;
                p3--;
            }
        }

        
        
    }
