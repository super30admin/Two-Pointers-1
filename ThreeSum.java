class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list1= new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l=i+1;
            int h=n-1;
            List<Integer> list= new ArrayList<>();
            while(l<h){

                int curr=nums[i]+nums[l]+nums[h];
                if(curr==0){
                    list=Arrays.asList(nums[i],nums[l],nums[h]);
                    list1.add(list);

                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }
                else if(curr>0){
                    h--;
                }else{
                    l++;
                }
            }
            //   list1.add(list);


        }
        return list1;

    }
}