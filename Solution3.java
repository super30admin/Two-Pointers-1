package twoptr2;
//Space Complexity: O(n)
//time complexity: O(nlogn)
public class Solution3 {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if(nums==null || nums.length ==0)return result;

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];

                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[low],nums[high],nums[i]);
                    result.add(li);
                    low++;high--;
                    while (low<high && nums[low]==nums[low-1]) low++;
                    while (low<high && nums[high]==nums[high+1]) high--;

                } else if(sum > 0){
                    high--;
                } else{
                    low++;
                }

            }
        }


        return result;
}
