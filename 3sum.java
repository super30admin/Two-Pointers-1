///Problem 15 : 3Sum
///Solved on leetcode and faced no issues
///Approach :First, sort the input array to enable the use of the two-pointer technique and handle duplicates.

// Fix one element at index i, and for the subarray from i+1 to end, use two pointers (low and high) to find two numbers such that their sum with nums[i] is zero.

// If the triplet is found, add it to the result and skip over any duplicates using while loops.

// If the sum is too large, move high--; if it's too small, move low++.

//Time complexity = O(nlogn) for sorting + O(n) for outer * O(n) for inner 
// = O(nlogn) + O(n^2)
//=O(n^2) as O(nlogn) is slower so ignore
//Sc = O(1)

Skip duplicates for the fixed element using if(i != 0 && nums[i] == nums[i-1]).
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>>output = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2 ; i++){
            if(i!=0 && nums[i] == nums[i-1]){ //avoiding outer duplicacy
                continue; 
            }
            int low = i+1;
            int high = nums.length - 1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){ //if u found the triplet , increment low n decrement high
                    output.add(Arrays.asList(nums[i] , nums[low],nums[high]));
                    low++;
                    high--;
                while (low < high && nums[low] == nums[low - 1]){ //avoiding inner duplicacy
                     low++;
                     } 
                while (low < high && nums[high] == nums[high + 1]) { ////avoiding outer duplicacy
                    high--;
                    } 
                }
                else if(sum > 0){ ///move towards target=0(shorter)
                    high--;

                }
                else{ 
                    low++;
                }

            }
        }
        return output;
        
    }
}