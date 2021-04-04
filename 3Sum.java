//Two Pointer Approach -
// Looping through the array once and internally converted it into TwoSum problem
//Space Complexity - O(1) - not including the result List<List<Integer>>
//Time Complexity - O(N^2)

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {

    if(nums == null || nums.length == 0) { return new ArrayList<>(); }

    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    for(int i=0; i<nums.length-2; i++){

      int low = i+1, high = nums.length-1;

      if(i>0 && nums[i] == nums[i-1]){
        continue;
      }

      while(low < high){

        int sum = nums[i] + nums[low] + nums[high];
        if(sum == 0){

          result.add(Arrays.asList(nums[i], nums[low], nums[high]));
          low++;
          high--;

          while(low < high && nums[low] == nums[low-1]){
            low++;
          }

          while(low < high && nums[high] == nums[high+1]){
            high--;
          }

        }else if(sum < 0){
          low++;
        }else{
          high--;
        }
      }
    }
    return result;
  }
}