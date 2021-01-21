
// Time Complexity : O(n2) (n square)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. While incrementing i, did not take into account unique values. Case [0,0,0,0] failed.



// Your code here along with comments explaining your approach
// 3 pointer approach - i -> For each i, we maintain 2 pointers low and high.
// Sort the array before calulatng the 3sum
//

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums == null || nums.length <= 2) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length -2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) { continue;} //ensures unique values

            int high = nums.length -1;
            int low = i+1;
            while(low < high) {

                int sum = nums[high] + nums[low] + nums[i];

                if(sum > 0) {
                   high--;
                } else if(sum < 0) {
                   low++;
                }
                else { //sum =0

                   List<Integer> threeSumList = new ArrayList();
                    threeSumList.add(nums[i]);
                    threeSumList.add(nums[low]);
                    threeSumList.add(nums[high]);

                    result.add(threeSumList);

                   low++;
                   high--;
                   while(low < high && nums[low] == nums[low-1]) { low++;} //ensures unique values
                   while(low < high && nums[high] == nums[high+1]) { high--;}//ensures unique values

                }

            }


        }

        return result;
    }
}
