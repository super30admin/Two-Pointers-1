//TC: O(n^2), n: length of  nums[]
//SC: O(1)

//Approach:
//1. We take three pointers, one at the beginning(i), one right after the beginning(i+1) and one at the last (n), and start calculating the sum and check
// if it is equal to 0, if it is, we add it to the list else we continue iterating the loop.
//2. So, For every number (nums[i]) in the array starting from index 0 to index n-2 (as we need triplets), we follow these two pointers (i+1 and n) and keep
// adding to our list as we get total sum 0 for any triplet.
//3. To take care of the fact that we don't need duplicates, everytime we get a new number in the main for loop, we compare it with the previous (nums[i-1]) and 
// make sure it is not the same, if it is, we skip the loop using continue statement.
//4. When we find a triplet, we add it to the list, and increase low and decrease high. Here, again there is a chance that we might face duplicates again,
// so as we increase low and decrease high, we compare them with their previous values and keep increasing/decreasing till they are not same anymore.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums== null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if((i>0) && nums[i-1]==nums[i]) continue;
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                if(nums[low]+nums[i]+nums[high]==0){
                List<Integer> list = Arrays.asList(nums[low], nums[i], nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(nums[low]+nums[i]+nums[high] < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}
