class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums==null || nums.length<=2)
        {
            return result;
        }
        
        //sort the given array
        Arrays.sort(nums);
        
        //loop untill length-2
        int p1 = 0;
        int p2 = 1;
        int p3 = nums.length-1;
        
        while(p1<nums.length-2 && nums[p1]<1)
        {
            
            //if prev value is equal to current val
            if(p1!=0 && (nums[p1] == nums[p1-1]))
            {
                p1++;
                p2++;
                continue;
            }
            
            //checking if it p2 crossed p3
            if(p2>=p3)
            {
                p1++;
                p2 = p1+1;
                p3 = nums.length-1;
                continue;
            }
            
            //checking for duplicates
            if(p2!=p1+1 && (nums[p2] == nums[p2-1]))
            {
                p2++;
                continue;
            }
            
            
            int sum = nums[p1] + nums[p2] +nums[p3];
            if(sum==0)
            {
                List<Integer> Rlist = Arrays.asList(nums[p1], nums[p2], nums[p3]);
                result.add(Rlist);
                p2++;
                p3--;
            }
            else if(sum<0)
            {
                p2++;
            }
            else{
                p3--;
            }
        }
        return result;
    }
}
