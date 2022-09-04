// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, implementation but I will get better with constant practice.


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> outputArray = new LinkedList();
        
        //Loops through the array and skips the next two numbers after to make sure the loop doesn't go out of bound.
        for(int i = 0; i < nums.length-2; i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1]))
            {
                int low = i + 1;
                int high = nums.length - 1;
                int total = 0 - nums[i];
                
                while(high > low)
                {
                    if(nums[low] + nums[high] == total)
                    {
                        outputArray.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while(low < high && nums[low] == nums[low + 1])
                        {
                            low++;

                        }

                        while(high > low && nums[high] == nums[high - 1])
                        {
                            high--;

                        }
                        high--;
                    }
                    else if(nums[low] + nums[high] > total)
                    {
                        high--;
                    }
                    else 
                    {
                        low++;
                    }
            }
        }
                     
     }
     return outputArray;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) 
    {
        if (height == null || height.length < 2) 
        {
		    return 0;
	    }
 
        int maximumArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) 
        {
            maximumArea = Math.max(maximumArea, (right - left) * Math.min(height[left], height[right]));
            
            //Checks if left height is less than right height, move right and find a value that is greater than left height.
            if (height[left] < height[right])
            { 
                left++;
            }
            
            //Checks if left height is greater than right height, move left and find a value that is greater than right height.
            else
            {
               right--;  
            }
               
        }

        return maximumArea;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1) - We are not using extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution 
{
    //Two-pass algorithm using Counting sort
    public void sortColors(int[] nums) 
    {
    
        int[] count = new int[3];
        
        for (int num : nums)
        {
            count[num]++;
        }
        
        int x = 0;
        
        //Iterates through the array counting the number of 0's, 1's, and 2's, then overwrites the array with the sorted numbers.
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < count[i]; j++) 
            {
                nums[x] = i;
                x++;
            }
        }
    }
}