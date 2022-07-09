// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //sort the input array
        Arrays.sort(nums);
        int n = nums.length;

        //iterate only through elements less than or equal to 0. Only then we will have possibilities of having 3 sum as 0 because of sorted array
        for(int i=0; i<n && nums[i]<=0; i++) {

            //As the result should be unique, ignore the elements that are equal to the previous elements
            if(i==0 || nums[i] != nums[i-1]) {

                //perform 2 sum on the rest of the elements
                int left = i+1;
                int right = n-1;

                //Iterate till left crosses right
                while(left < right) {

                    //obtain 3 sum
                    int sum = nums[i]+nums[left]+nums[right];

                    //if sum < 0, then increment left as we need greater element to form 0
                    if(sum < 0){
                        left++;
                    } // if sum > 0, then decrement right as we need lesser element to form 0
                    else if(sum > 0){
                        right--;
                    } //if sum = 0, then add three elements to the result list, increment left and decrement right, and
                    // ignore the elements that are equal to the left and the right element as we need to return a unique result list
                    else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return result;
    }
}