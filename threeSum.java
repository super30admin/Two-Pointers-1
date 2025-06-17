// Time Complexity = O(n^2)
// Space complexity = O(1)
/* Approach : Sort the given array. Iterate over the array having two pointers
at first and last element of array. whenever the current element summing up with
low'th and high'th element results to 0 then simply store those values in a list.
when current sum is 0 then check for low'th element is same as previous element, if 
yes then increment low, similiarily check if high'th element is same as next element
then decrement high. if the currentSum is greater than 0 then decrement high else 
increment low.The considerations we need to check is, the low is less than high, 
the index should not be 0, current element for current index's elementis less than 
previous index's element. 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;                                 // validate if array is empty
        int n = nums.length;
        Arrays.sort(nums);                                                  // sort the array

        for(int i=0; i<n-2; i++){                                           // iterate over array
            if(i != 0 && nums[i] == nums[i-1])continue;                     // validate if index is not 0 and current element is not same as previous element to avoid duplicacy
            if(nums[i] > 0) break;                                          // current element is greater than 0 break the loop
            
            int l = i+1;                                                    // low is initialized
            int h = n-1;                                                    // high is initialized
            while(l < h){                                                   // validate low is less than high
                int currSum = nums[i] + nums[l] + nums[h];                  // sum up current index's , low's and high's element
                if(currSum == 0){                                           // validate if sum is 0
                    result.add(Arrays.asList(nums[i],nums[l],nums[h]));     // add the i, low and high to list
                    l++;                                                    // increment low
                    h--;                                                    // decrement high
                    while(l < h && nums[l] == nums[l-1]){                   // validate if low'th element is same as its previous element
                        l++;                                                // increment low
                    }
                    while(l < h && nums[h] == nums[h+1]){                   // validate if high'th element is same as its next element
                        h--;                                                // decrement high
                    }
                }
                else if(currSum > 0){                                       // validate sum greater than 0                   
                    h--;                                                    // decrement high
                }
                else{                                                       // validate sum less than 0 
                    l++;                                                    // increment low
                }

            }
        }
        return result; 
    }
}