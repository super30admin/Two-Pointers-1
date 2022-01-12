# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int low =0;
        int high = nums.length-1;
        int mid= 0;
        //at any given point of time, the low pointer keeps track of zeros, the middle pointer keeps
        // track of the 1s and the high pointer keeps track of the 2s
        // whenever we find a 0 in the middle, we move it to the left by swapping with low
        //whenever we find a 2 in the middle, we move it to the right by swapping with high
        //whenever we find a 1 in the middle, we simply let it be
        
        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(nums, mid, high);
                high--;
            }
            
        }
    }
}

## Problem2 (https://leetcode.com/problems/3sum/)
// Time Complexity :O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Not Any


// Your code here along with comments explaining your approach
class Solution {
    List<List<Integer>> result;
    private void twoSum(int[] nums, int start)
    {
        int low = start+1;
        int high = nums.length -1;
        while(low < high)
        {
            int sum = nums[start] + nums[low] + nums[high];
            if(sum < 0)
            {
                low ++;
            }
            else if ( sum > 0)
            {
                
                high--;
            }
            else 
            {
               result.add(Arrays.asList(nums[start], nums[low], nums[high]));
                low++; 
                high--;
                while (low < high && nums[low] == nums[low - 1])
                    ++low;
                while (low < high && nums[high] == nums[high + 1])
                    high--;
            }
        }
    }  
     
    
    public List<List<Integer>> threeSum(int[] nums) {
        //if(nums == null || nums.length <3 ) return new ArrayList<>();
        
        Arrays.sort(nums);
        result = new ArrayList<>();
        for(int i=0; i< nums.length && nums[i] <=0 ; i++)
        {
            if(i ==0 || nums[i] != nums[i-1])
            {
                twoSum(nums, i);
            }
        }
        
        return result;
    }
}
## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Not any


// Your code here along with comments explaining your approach
class Solution {
    //Time Comlexity: O(N^2)
    //Space complexity: O(1)
    /*public int maxArea(int[] height) {
        if(height == null || height.length == 0)
        {
            return 0;
        }
        int max=0;
        for(int i=0; i< height.length; i++)
        {
            for(int j= i+1; j< height.length ; j++)
            {
                max = Math.max(max, Math.min(height[i], height[j])* (j-i));
            }
        }
        
        return max;
    }*/
    
    //Time Comlexity: O(N)
    //Space complexity: O(1)
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
        {
            return 0;
        }
        int max=0;
        int low =0;
        int high = height.length -1;
        while(low <= high)
        {
            max = Math.max(max, Math.min(height[low], height[high])* (high-low));
            if(height[low] <= height[high])
            {
                low++;
            }
            else if (height[low] > height[high])
            {
                high--;
            }
            
        }
        return max;
    }
}