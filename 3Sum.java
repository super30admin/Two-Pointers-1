//Time: O(nlogn) + O(n^2) = o(n^2)
//Space: O(1)

/* Approach: Using 2 pointers approach
1. sort the array
2. For each element, iterate through the array using 2 pointers to check target sum of 0

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();

        Arrays.sort(nums);
        int n= nums.length;


        for(int i=0;i<n;i++){

            if(i!=0 && nums[i]==nums[i-1])continue; //avoid duplicate for first triplet value
            int sum=nums[i];
            int target=-sum;

            int low=i+1, high=n-1;

            while(low<high){

                int currSum=nums[low]+nums[high];

                if(currSum==target){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;

                    while(low<high && nums[low]==nums[low-1]) low++; //avoid duplicate values
                    while(high>low && nums[high]==nums[high+1]) high--;
                }
                else if(currSum<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}