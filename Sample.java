// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        if(nums==null||nums.length<3)
            return result;
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;high--;
                    while(low<high&&nums[low]==nums[low-1])low++;
                    while(low<high&&nums[high]==nums[high+1])high--;
                }
                else if(sum>0)
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

-------------------------------------------------------------------------------------------------------------------

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}

--------------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public void sortColors(int[] nums) {
       if(nums==null||nums.length==0)
       {
           return;
       }
        int low=0;int mid=0;int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else
            { 
                swap(nums,low,mid);
                low++;mid++;
            }
            
        }
    }
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}