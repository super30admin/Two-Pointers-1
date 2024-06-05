//Time Complexity - O(n^2) + O(nlogn) ==> O(n^2)
//Space Complexity - O(1)
//Approach - Fix the outer loop from i = 0 to n . Then initialize the left and right pointers to perform 2 pointer approach. 
//Every time when the sum is less than 0 , increment left and decrement right if sum is greater than 0. 
//When we get sum == 0 , store the triplet as a list and then make sure it is not a duplicate by checking the neighbour of left ptr and right ptr. 
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        //Using 2 pointer , so sorting must be done
        Arrays.sort(nums);
        int n = nums.length; 
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            //checking duplicates in outer loop
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //when i is +ve , j and k will also be +ve numbers. Sum of three +ve numbers can never equate to zero. 
            if(nums[i] > 0){
                break;
            }
            int left = i + 1;
            int right = n - 1;
            
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }

                }
                else if(sum < 0){
                    left++;

                }
                else{
                    right--;

                }
        }

        }
        return result;
}
}
//BRUTE FORCE - Time complexity - O(n^3)
//Space - O(n)
    //     HashSet<List<Integer>> set = new HashSet<>();
    //     List<List<Integer>> result = new ArrayList<>();
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             for(int k = j + 1; k < nums.length; k++){
    //                 if(nums[i] + nums[j] + nums[k] == 0){
    //                     List<Integer> temp = Arrays.asList(nums[i], nums[j],nums[k]);
    //                     Collections.sort(temp);
    //                     if(!set.contains(temp)){
    //                         set.add(temp);
    //                         result.add(temp);
    //                     }


    //                 }
    //             }
    //         }
    // }
    // return result;
        
