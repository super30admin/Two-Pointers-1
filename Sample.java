// Container with most water

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        int diff;
        int min = 0, max =0;
        int n = height.length;
        int high = n-1;
        int low = 0;
        
        while(low<high)
        {
            int currArea = Math.min(height[low], height[high])*(high-low);
            max = Math.max(currArea, max);
            if(height[low]<=height[high]) low++;
            else 
                high--;
        }
        
        return max;
    }
}

// Sort Colors

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    
    //op solution
    
    public void swap(int[] nums, int p1, int p2)
    {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int low=0;
        int mid=0;
        int n = nums.length;
        int high=n-1;
        int temp;

        while(mid<=high)
        {
            if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
        
    }
}

//3Sum

// Time Complexity : O(n^2 + nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n == 0 || nums == null) return result;
        
        Arrays.sort(nums);
        
        for(int i =0;i<n-2;i++)
        {
            //outside duplicacy
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low<high)
            {
                int sum = nums[low]+nums[high]+nums[i];
                if(sum == 0)
                {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    //inside duplicate 
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                else if(sum > 0)
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }
            
        }
        return result;
        
        
    }
}