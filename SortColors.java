// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public void sortColors(int[] nums) {
        //points to 0
        int i = 0;
        //points to 1
        int j = 0;
        //points to 2
        int k = nums.length - 1;
        while(j <= k){
            if(nums[j] == 1)
                j++;
            else if(nums[j] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[j] == 2){
                swap(nums,j,k);
                k--;
            }
        }
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}