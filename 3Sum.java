xcvbnm,aaclass Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0 ; i<nums.length; ++i)
        {
            if(i!=0 && nums[i]== nums[i-1])
                continue;

            int l = i+1, r = nums.length-1;

            while(l<r)
            {
                int currSum = nums[i]+nums[l]+nums[r];

                if(currSum ==0)
                {
                    List<Integer> temp= Arrays.asList(nums[i], nums[l], nums[r]);
                    Collections.sort(temp);
                    result.add(temp);
                    ++l;
                    --r;

                    while(l<r &&nums[l]== nums[l-1]) // can be l+1
                    {
                        ++l;
                    }

                    while(l<r && nums[r]== nums[r+1])
                    {
                        --r;
                    }

                }
                else if (currSum<0)
                {
                    ++l;
                }
                else{
                    --r;
                }
            }
        }
        return result;
    }
}