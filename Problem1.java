//Sort Colors 
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//if we see 0 or 2 at left and right we swap it 
/// if we see 1 don't do anything
//we have oen pointer at i starting from left another at j from right
// we have one other pointer current to check the current element, which traverses the arr

class Problem1{
public static void main(String[] args){
    int[] nums = {2,0,2,1,1,0};
    int[] nums2 = {2,0,1};
    sortColors(nums2);
    for(int num : nums2){
        System.out.print(" "+num);
    }

}
public static void sortColors(int[] nums) {
    int n = nums.length;
    int i = 0, j = n-1; 
    int current = 0;
    while(current < n){
        //if you found 0 or 2 ar curr position
        if((nums[current] == 0 && current > i) || (nums[current] ==2  && current <j)){
            //if you found 0 at curr position
            if(nums[current]==0){
                //we swap it with whatever is at i position 
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
                i++;

            }
            //if we find 2, we replace with whatever we have j position
            if(nums[current]==2){
                int temp = nums[j];
                nums[j] = nums[current];
                nums[current] = temp;
                j--;

            }


        }
        current++;

    }
}
}
