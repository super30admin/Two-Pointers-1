//****CONTAINER WITH MOST WATER***
// Time Complexity :O(n);
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :N
class Solution {
    public int maxArea(int[] height) {
        //null case
        int max=0;
        int n=height.length;
        if(height.length==0 || height==null)
        {
            return max;
        }
        
        int low=0;
        int high=n-1;
        int start=0;
        int end=0;
        
        while(low<high)
        {
            int currA=Math.min(height[low],height[high])*(high-low);
            if(max<currA)
            {
                max=currA;
                start=low;
                end=high;
            }
            
            if(height[low]<height[high])
            {
                low++;
            }
            else{
                high--;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}

//****3-SUM***
// Time Complexity :O(nlogn)+ O(n)square == O(n)square;
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :N

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        //null case
        if(nums.length==0 || nums==null)
        {
            return result;
        }
        //Sorting the array
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            //handling the outer duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int low=i+1;
            int high=n-1;
            while(low<high)
            {
                int sum= nums[i]+nums[low]+nums[high];
                
                if(sum==0)
                {
                    List<Integer> li= Arrays.asList(nums[i], nums[low],nums[high]);
                    result.add(li);
                    
                    low++; high--;
                    //Handling the internal duplicates
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1])
                    {
                        high--;
                    }
                    
                    
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

// Your code here along with comments explaining your approach
