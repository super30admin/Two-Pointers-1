/*
 * Time complexity: O(N)
 * Space complexity: O(1) constant space
 * */
class Solution {
    private void swap(int idx1, int idx2, int[] nums){
            int temp = nums[idx2];
            nums[idx2] = nums[idx1];
            nums[idx1] = temp;
        }
        
    public void sortColors(int[] nums) {
        //Using pointer approach
        int p0 = 0, curr = 0, p2 = nums.length-1;
        // System.out.println("Comparing p1 p2: "+nums[curr]+" "+nums[p2]);
        while(curr<=p2){
            if(nums[curr]==1){
                curr++;
            }else if(nums[curr]==2){
                swap(curr,p2,nums);
                p2--;
            }else if(nums[curr]==0){
                swap(curr,p0,nums);
                p0++;
                curr++;
            }
        }
       
    }
}