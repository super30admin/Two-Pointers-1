// Time Complexity : O(nlogn + n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : sort array. For each element in array, check if there are two other elements that can be found that sum
/// up to 0 (including curr). To find if there are two elements in sorted array that sum up to -curr (0-curr), use two
/// pointers. start two pointers at beginning and nd of subarray. If sum+curr<0, inc low pointer else high pointer
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }
            int low = i+1, high = nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum==0){
                    List<Integer> li = new ArrayList<Integer>();
                    li.add(nums[i]);
                    li.add(nums[low]);
                    li.add(nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(sum>0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return result;
    }
}