// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n

class Solution {
    public void sortColors(int[] nums) {
            int count0 =0, count1=0, count2=0;
            for(int i=0;i<nums.length;i++)
            {
                //maintaining counts of all numbers(colours)
                if(nums[i]==0)
                    count0++;
                else if(nums[i]==1)
                    count1++;
                else
                    count2++;
            }
            
            int i=0;
            while(count0>0)
            {
                nums[i++]=0; //using same array to save space (inplacing)
                count0--; //reducing the coount after filling the array with the crct element at crct position
            } 
            
            while(count1>0)
            {
                nums[i++]=1;
                count1--;
            }
            
            while(count2>0)
            {
                nums[i++]=2;
                count2--;
            }
            
        }
    }