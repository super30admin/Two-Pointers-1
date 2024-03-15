// Time Complexity : O(n^2 + n log n) => O(n^2)
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        // sort the array
        Arrays.sort(nums); // additional time n log n
        int start, end;
        // start iterating nums to find the integers whose sum will be 0
        for(int i=0; i< nums.length-2; i++){
            start = i+1; // because 1st integer would be at i index, so taking next
            end = nums.length -1;
            if(i!=0 && nums[i] == nums[i-1]){
                continue; // duplicates
            }
            while(end > start){ // check for cross over
                int currentSum = nums[i] + nums[start] + nums[end];
                if(currentSum == 0) {
                    // create a new arraylist and add all three values in it
                    resultList.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    // increment start, to check for next combination
                    start++;
                    // decrement end, to check for next combination
                    end--;

                    while(start < end && nums[start] == nums[start - 1]){
                        start++; // if both numbers are same keep incrementing until we find unique
                    }
                    while(start < end && nums[end] == nums[end+1]){
                        end--; // if both numbers are same keep incrementing until we find unique
                    }

                } else if(currentSum < 0){ // is sum is smaller than 0, then move start to find other combinations
                    start++;
                } else {
                    // if sum is greatr than 0, move end to left to find other combinations
                    end--;
                }
            }
        }
        return resultList;
    }
}