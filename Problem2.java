//We use Sorting + Two Pointer technique.
//
//Steps:
//Sort the array
//Fix one number (i)
//Use two pointers (low, high) to find remaining two numbers
//Skip duplicates to avoid duplicate triplets
//Move pointers based on sum
//
//Time: O(n²)
//Space: O(1) (excluding result)

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {


        // Step 1: Sort the array
        // Sorting helps use two pointer technique and skip duplicates
        Arrays.sort(nums);


        int n = nums.length;


        // Result list to store all unique triplets
        List<List<Integer>> result = new ArrayList<>();


        // Step 2: Fix first element
        for(int i = 0; i < n; i++) {


            // Skip duplicate values for first element
            // to avoid duplicate triplets
            if(i != 0 && nums[i] == nums[i - 1])
                continue;


            // If current number > 0, no triplet can sum to 0
            // because array is sorted
            if(nums[i] > 0)
                break;



            // Step 3: Use two pointer for remaining array
            int low = i + 1;
            int high = n - 1;



            while(low < high) {


                // Calculate current sum
                int sum = nums[i] + nums[low] + nums[high];



                // Case 1: Found valid triplet
                if(sum == 0) {


                    // Add triplet to result
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));


                    // Move both pointers
                    low++;
                    high--;


                    // Skip duplicate values for low pointer
                    while(low < high && nums[low] == nums[low - 1])
                        low++;


                    // Skip duplicate values for high pointer
                    while(low < high && nums[high] == nums[high + 1])
                        high--;
                }



                // Case 2: Sum is too large → decrease high
                else if(sum > 0) {

                    high--;
                }



                // Case 3: Sum is too small → increase low
                else {

                    low++;
                }
            }
        }



        // Return all unique triplets
        return result;
    }
}