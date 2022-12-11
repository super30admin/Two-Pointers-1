// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :yes, coming up with the perfect condition for the first while loop was hard


// Your code here along with comments explaining your approach

// we will take two pointer left and right, left would be pointing to the place where 0 should b 
// any index before left  would mean that all the items are 0 on those indices, same goes for right but it would point to the 2
// another pointer mid is needed to go over the elements , elements <1 are swapped with left , >1 are swapper with right

class Solution {
    public void sortColors(int[] nums) {

        int left=0,mid=0,right=nums.length-1;

        // mid would point to the current element
        while(mid<=right){

            // check where mid is pointing to 

            // but before that , if mid is below left, then increment mid

            if(mid<left){
                mid++;
            }
            else if(nums[mid] == 0){
                // swap with left and move left 
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
            }
            else if(nums[mid] == 2){
                // swap with rigjht and move right
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
            else{ // mid pointing to 1
            mid++;
            }
        }
    }
}