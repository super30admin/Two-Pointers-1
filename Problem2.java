class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         Time complexity - O(n^2)
         Space complexity - O(1)
         **/
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null||nums.length<3)
            return result;
        Arrays.sort(nums);
        int low = 0;
        int sum = 0;
        int high = nums.length-1;

        for(int i=0; i<nums.length-2; i++)
        {
            if(i>0&&nums[i]==nums[i-1]) //to avoid any duplicates
                continue;
            sum = nums[i];
            if(sum>0)
                break;
            high = nums.length-1;
            low = i+1;

            while(low<high)
            {
                if(nums[low]+sum+nums[high]>0)
                    high--;
                else if(nums[low]+sum+nums[high]<0)
                    low++;
                else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low<high&&nums[low]==nums[low-1])low++;
                    while(low<high&&nums[high]==nums[high+1])high--;
                }
            }
        }
        return result;
    }
}
