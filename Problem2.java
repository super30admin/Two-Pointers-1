// Time Complexity : O(n^2)
//  Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
// Three line explanation of solution in plain english:
//1. We use a two-pointer approach to find all unique triplets in the array that sum up to zero.
//2. The array is sorted to make it easier to avoid duplicates and use the two-pointer technique.
//3. For each element, we fix it and then use two pointers to find the other two elements that complete the triplet.    

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        // Initialize the result list to store unique triplets
        List<List<Integer>>result=new ArrayList<>();
        // If the array has less than 3 elements, return an empty list
        if(n<3){
            return result;
        }
        // Sort the array to facilitate the two-pointer approach and avoid duplicates
        Arrays.sort(nums);
        // Iterate through the array, fixing one element at a time
        // We only need to iterate up to n-2 because we need at least two more
        for(int i=0;i<n-2;i++){
            // If the current element is greater than 0, break the loop
            // because no three numbers can sum to zero if the smallest number is greater than 0
            //perform binary search and find two other elements
            int low=i+1;
            int high=n-1;
            if (i>0 && (nums[i-1]==nums[i]))continue;
            while(low<high){
                int curSum=nums[i]+nums[low]+nums[high];
                if(curSum==0){
                    // If the sum is zero, we found a triplet
                    // Add the triplet to the result list
                    List<Integer> list=Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    // Skip duplicates for the second element
                    // We increment low and decrement high to avoid duplicates
                    while(low < high && nums[low] == nums[low-1]) low++;
                    // Skip duplicates for the third element
                    while(low < high && nums[high] == nums[high + 1]) high--;
                    } 
                    // If the current sum is less than zero, we need a larger number
                    else if (curSum < 0){ 
                        low++;
                    // If the current sum is greater than zero, we need a smaller number
                    }else{ 
                        high--;
                    }
            }
        }
        return result;
    }
}