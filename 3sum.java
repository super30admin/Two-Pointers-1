//Passed all test cases on Leet Code
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Hashset to have all the unique values as result
        Set<List<Integer>> res  = new HashSet<>();
        //base case
        if(nums.length==0) return new ArrayList<>(res);
        //Sort the array
        Arrays.sort(nums);

        //traverse loop till length-2;j =i+1;k=length-1
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            //while loop condition
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                //triplet sum equals zero

                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);


    }
}