1// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/* we can count the number of 0s,1s and 2s and just set them in the array which works but that would be pass through the array twice
I have proceeded with two point approach along with an additional pointer as marker for tracking the mid value.
*/
class Solution {
    public void sortColors(int[] nums) {
        //two pointer
        int l=0, mid =0;//left for tracking 0s and mid for tracking 1s
        int r = nums.length-1;// right for tracking 2s
        while(mid<=r){
            if(nums[mid]==2){
                swap(nums, mid, r);//move the 2s to right
                r--;//reduce right by 1 since we know 2 is in the end
            }
            else if(nums[mid]==0){
                swap(nums, l, mid);//move 0 to the front
                l++;//move left since we know 0 is in the front
                mid++;
            }
            else{
                mid++;//since the number is 1 do nothing as 1 is in mid
            }
        }
    }

    public void swap(int []nums, int x, int y){
        int temp = nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}