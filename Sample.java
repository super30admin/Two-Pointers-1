//Problem1 
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
     int left=0;
     int right=nums.length-1;
     int mid=0;
     while(mid<=right)
     {
        if(nums[mid]==2)
        {
            int temp=nums[right];
            nums[right]=nums[mid];
            nums[mid]=temp;
            right--;
        }
        else if(nums[mid]==0)
        {
            int temp=nums[left];
            nums[left]=nums[mid];
            nums[mid]=temp;
            mid++;
            left++;


        }
        else{
            mid++;
        }
     }   
    }
}
//Problem2 
// Time Complexity :O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       if(nums.length==0||nums==null) return new ArrayList<>();
       Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>();
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        if(i>0 && nums[i]==nums[i-1])
        {
            continue;
        }
        if(nums[i]>0){
            break;
        }
        int left=i+1;
        int right=n-1;
        while(left<right)
        {
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0)
            {
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                while(left<right&&nums[left]==nums[left-1])
                {
                    left++;

                }
                while(left<right&& nums[right]==nums[right+1])
                {
                    right--;
                }

            }
            else if(sum<0)
            {
                left++;
            }
            else{
                right--;
            }
        }
       } 
       return result;
    }
}

//Problem3
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
