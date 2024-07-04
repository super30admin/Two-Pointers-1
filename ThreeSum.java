/**

 Approach: 3 pointers

 Working:
     Sort the input array
     iterate over the array with pointer i
         case check if pointer i >0 and check in i-1 != i to avoid duplicates in the outer loop
         declare 2 pointers left = i+ and right = array.length-1
         check if left < right
             check if sum of values in the index i, left, right equals zero
             Then add it to the result set
             increment left and decrement right
             to avoid duplicate result set
                 move the left pointer till value in left == left-1
                 similarly decrement the right pointer
         check if sum < 0 indicated we need bigger value to obtain result
            increment left pointer
         else
             sum>0 indicates that the sum greater than the value, so we ned small value
             decrement right
     return the resultant

 Time Complexity: O(n^2)
 Space Complexity: O(1)


 */

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<n; i++) {

            //to move to the next no repetable element i.e 1,1,1,2,,37 if i =1, move to index 3
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            //is the value in i is greater then zero, the requires summ 0 will not be formed
            if(nums[i] > 0) {
                break;
            }

            int left = i+1;
            int right = n-1;

            while(left < right) {


                int sum = nums[i]+nums[left]+nums[right];
                //System.out.println(sum);

                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //System.out.println("Hi i have added");

                    //move to the next unique value in left
                    while(left<right && nums[left] == nums[left-1]) {
                        left++;
                    }

                    //moving to next unique value in right
                    while(left<right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
                else if(sum < 0) { // required sum is lesser
                    left++;
                }
                else{ //required sum greater
                    right--;
                }
            }
        }
        return res;
    }
}
