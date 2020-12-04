// Time Complexity :O(N) n are the number of elements in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public void sortColors(int[] nums) {
        int redIndex =0;
        int blueIndex=nums.length-1;
        int i=0;
        int temp;
        while( i<=blueIndex){            
            if(nums[i]==0){
                if(i!=redIndex){
                    temp=nums[i];
                    nums[i]=nums[redIndex];
                    nums[redIndex]=temp;
                }
                redIndex++;
                i++;
            }
            else if(nums[i]==2){
                if(i!=blueIndex){
                nums[i]=nums[blueIndex];
                nums[blueIndex]=2;                    
                }
                
                blueIndex--;
            }
            else if(nums[i]==1){
                i++;
            }
        }
    
    }
}