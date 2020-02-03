/* 3Sum */

/* Optimised approach- Two Pointers */
// Time Complexity : O(N^2)
// Space Complexity : O(1) in place
// Did this code successfully run on Leetcode : Yes. 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//we will use two pointers approach to reduce time complexity
//here we will iterate over array by fixing first index and initialising low and high pointers
//keep iterating element by incrementing index and increment/decrement low and high pointers

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //Edge case
        if(nums == null || nums.length < 3) return result; //we require 3 elements for 3sum else return empty arraylist
        //sort array -O(NlogN)
        Arrays.sort(nums);
        int n = nums.length;
        //first iterate over array by fixing first index
        for(int i = 0; i < n-2; i++){
            //validate if adjacent elements are equal, then skip it
            if((i>0) && (nums[i-1] == nums[i])) continue;
            //initialise low and high pointers
            int low = i+1;
            int high = n-1;
            //terminating condition: low shouldn't override high
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                //Case 1) sum equals 0
                if(sum == 0){
                    List<Integer> current = Arrays.asList(nums[i], nums[low], nums[high]);
                    //adding current arrayslist sum to final result
                    result.add(current);
                    //keep incrementing low pointer
                    low++;
                    //keep decrementing high pointer
                    high--;
                    //validate if low and previous index elements are not equal, if it is then skip that index and increment
                    while(low < high && nums[low] == nums[low-1]) low++;
                    //check for duplicates
                    while(low < high && nums[high] == nums[high+1]) high--;
                }
                //Case 2) sum less than 0
                else if(sum < 0) {
                    low++;
                }
                //Case 3) sum greater than 0
                else {
                    high--;
                }
            }
        }
        return result;
    }
}






/* Brute force
// Time Complexity : O(N^3)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes. Resulted in time limit exceeded
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//first we will start with brute force solution. In this we will 
//initialise hashset and store 3 unique values that equals sum=0 by using 3 nested loops
//we will ensure to sort the list in the set and return values in set 
//in form of array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //initialise hashset
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        //using 3 nested loops
        //we will be iterating until n-2 because we are considering 3 elements
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    //initialise sum
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        //adding values in form of list
                        List<Integer> myList = Arrays.asList(nums[i], nums[j], nums[k]);
                        //sort the elements in myList
                        Collections.sort(myList);
                        //keep adding values in hashset
                        set.add(myList);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

*/
