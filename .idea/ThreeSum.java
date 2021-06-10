class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;
        Arrays.sort(nums);
        int right = nums.length - 1;
        //i is the pivot
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) //outside duplicacy check
                continue;
            int low = i+1;
            int high = nums.length - 1;
            if(nums[i]>0)
                break;
            while(low<high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum ==0)
                {
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    res.add(list);
                    low++;
                    high--;
                    //inner duplicacy check
                    while(low< high && nums[low]== nums[low-1])
                        low++;
                    while(low< high && nums[high]==nums[high+1])
                        high--;
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
        return res;
    }
}

//time complexity is O(N^2)
//space complexity is O(1)