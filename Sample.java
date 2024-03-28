
# Two-Pointers-1

// Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 




class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int k=0;
        int h=nums.length-1;
        while(l<=h)
        {
            if(nums[l]==2)
            {
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                h--;
            }
            else if(nums[l]==0)
            {
                int temp=nums[k];
                nums[k]=nums[l];
                nums[l]=temp;
                k++;
                l++;
            }
            else
            l++;
        }   
    }
}


//Problem2 (https://leetcode.com/problems/3sum/)

//time complexity: O(n)
//space complexity: O(n)
// Did this code successfully run on Leetcode : yes



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            List<Integer> res=new ArrayList<Integer>();
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(nums[left]==nums[left-1] && left<right)
                        left++;
                    while(nums[right]==nums[right+1] && right>left)
                        right--;

                }
                if(nums[i]+nums[left]+nums[right]>0)
                    right--;
                else if(nums[i]+nums[left]+nums[right]<0)
                    left++;      
            }
        }
        return result;
    }
}




// Problem3 (https://leetcode.com/problems/container-with-most-water/)

//time complexity: O(n)
//space complexity: O(1)
// Did this code successfully run on Leetcode : yes 


class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            res=Math.max(res,(right-left)*Math.min(height[left],height[right]));
            if(height[right]<=height[left])
            {
                right--;
            }
            else 
            {
                left++;
            }
        }
        return res;   
    }
}