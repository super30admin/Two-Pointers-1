// Time Complexity :
O(n)
// Space Complexity :
O(1)
// Did this code successfully run on Leetcode :
yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        for(int i=0;i<=high;){
            if(nums[i]==0){
                int temp=nums[low];
                nums[low]=nums[i];
                nums[i]=temp;
                //swap(nums,i,low);
                low++;
                i++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                int temp1=nums[high];
                nums[high]=nums[i];
                nums[i]=temp1;
             //swap(nums,i,high);
                high--;
            }
        }
    }
}