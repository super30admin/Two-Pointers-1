public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> all= new HashSet<>();

        Arrays.sort(nums);

        if(nums.length==0)
            return new ArrayList<>(all);

        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                if((nums[i]+nums[j]+nums[k])==0)
                {
                    all.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                if((nums[i]+nums[j]+nums[k])>0)
                {
                    k--;
                }
                else if((nums[i]+nums[j]+nums[k])<0)
                    j++;
            }



        }

        return new ArrayList<>(all);


    }
}