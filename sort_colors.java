// Time Complexity :O(n) n-length of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : -
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        for(int i=0;i<=high;i++)
        {
        if(nums[i]==0) // if nums[i]==0 swap nums[i] with the low pointer and move the low pointer up
        {
            int temp=nums[i];
            nums[i]=nums[low];
            nums[low]=temp;
            low++;
        }else if(nums[i]==2) // if nums[i]==2 then swap element with high pointer and dont increment i because the new nums[i] is not sorted yet
        {
            int temp=nums[i];
            nums[i]=nums[high];
            nums[high]=temp;
            high--; 
            i--;
        }
                
        }
        
        
    }
}
//Alternate approach
/*
class Solution {
    public void sortColors(int[] nums) {
       int red=0,white=0,blue=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                red++;
            else if(nums[i]==1)
                white++;
            else
                blue++;
                
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(red>0)
            {
                nums[i]=0;
                red--;
            }
            else if(white>0)
            {
                nums[i]=1;
                white--;
            }
            else
                nums[i]=2;
        }
        
    }
}
*/