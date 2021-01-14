// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//We will sort the array and have a low,mid,and high pointer. We want to have the total of the 3 numbers 0, so we move
//the pointers accordingly. If the total is high, we move the high pointe down to a lower number, and low will move up
//if it is less than 0. We do this until low and high meet and have gone through all the possibilities.

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int low = i + 1;
            int high = nums.length -1;


            while(low < high){

                int sum = nums[low] + nums[high] + nums[i];

                if(sum == 0){
                    //add to our result array
                    List<Integer> temp = Arrays.asList(nums[low],nums[high],nums[i]);
                    result.add(temp);
                    low++;
                    high--;
                    //skip duplicates for low pointer
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    //skip duplicates for high pointer
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
                else if(sum > 0){
                    high--; //get closer to 0
                }
                else{
                    low++; //get closer to 0
                }


            }

        }
        return result;
    }
}