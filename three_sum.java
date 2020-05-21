//Time Complexity: O(N^2)
//Space Complexity: O(N^2)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       /*
        List<List<Integer>> output = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<= nums.length -3; i++)
        {
            if(i==0 || nums[i] > nums[i-1])
            {
                int start = i+1;
                int end = nums.length -1;
                while(start < end)
                {
                    if(nums[i] + nums[start] + nums[end] == 0)
                        output.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    if(nums[i] + nums[start] + nums[end] < 0)
                    {
                        int currentstart = start;
                        while(nums[currentstart] == nums[start] && start < end)
                            start++;
                    }
                    else
                    {
                        int currentend = end;
                        while(nums[currentend] == nums[end] && start < end)
                            end --;
                    }
                }
            }
        }
        return output;
        */
        
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<=nums.length -3 ; i++)
        {
            if(i==0 || nums[i] > nums[i-1])
            {
                
                int start = i+1;
                int end = nums.length-1;
                while(start < end)
                {
                    if(nums[i] + nums[start] + nums[end] == 0)
                        output.add(Arrays.asList(nums[i],nums[start], nums[end]));
                    if(nums[i] + nums[start] + nums[end] < 0)
                    {
                        int currentstart = start;
                        while(nums[currentstart] == nums[start] && start < end)
                            start ++;
                    }
                    else
                    {
                        int currentend = end;
                        while(nums[currentend] == nums[end] && start < end)
                            end --;
                    }
                }
            }
        }
        return output;
    }
}