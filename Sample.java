Problem 75- sort colors
// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
  
  class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                int num;
                num=nums[high];
                nums[high]=nums[mid]; 
                nums[mid]=num;
                high--;

            }
            else if(nums[mid]==0)
            {
                int dnum;

                dnum=nums[low];
                nums[low]=nums[mid]; 
                nums[mid]=dnum;
                mid++;
                low++;
            }
            else
            {
                mid++;
            }
        }    
    }
}




Problem 11- container with more water
// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int m=0;
        int p1,p2;
        p1=0;
        p2=height.length-1;
        
        while(p1<p2)
        {
            if(height[p1]>height[p2])
            {
                m= Math.max(m,height[p2]*(p2-p1));
                p2--;
            }
            else
            {
                m= Math.max(m,height[p1]*(p2-p1));
                p1++;
            }
        }
        return m;
        
    }
}
