// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I have three pointers each for 0, 1 and 2 which are low,mid and high.
 * take mid and when it is 1 then move , if 0 swap and move, if 2 swap
 */
class Solution {
    public void sortColors(int[] nums) {
        int low = 0,high = nums.length - 1,mid = 0;
        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}

// Time Complexity : o(n2logn)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Sort the array and fix one element, do binary search on the rest of the elements
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        for(int i = 0;i < nums.length - 2;i++)
        {
             if(i!=0 && nums[i] == nums[i-1]  )
                    continue;
            int low = i+1;
            int high = nums.length - 1;
            while(low < high)
            {
                int sum = nums[low] + nums[high] + nums[i];
                if(sum == 0)
                {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[low]);
                    arr.add(nums[high]);
                    arr.add(nums[i]);
                    al.add(arr);
                   low++;
                   high--;
                   while(low<high && nums[low] == nums[low-1]  )
                    low++;
                    while(low<high && nums[high] == nums[high+1] )
                    high--;
                }
                 
                 
                else if(sum < 0)
                {
                    low++;
                }           
                else
                {
                    high--;
                }   
                           
            }
        }
        
      
   
        return al;
    }
}

// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Considering the maximum area as minimum of heights and width as difference
 */

class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int area = Math.min(height[low],height[high]) * (high-low);
        while(low < high){
            int h = Math.min(height[low],height[high]);
            int w = high - low;
            if(h*w > area)
                area = h*w;
            if(height[low] <= height[high])
                low++;
            else
                high--;
        }
        return area;
    }
}