//Time Complexity: O(n*n) n = size of nums
//space Complexity : O(1)
//didn't face any problems
//runs successfully

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Three3Sum15LeetCode {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);                                                                  //sorting an array
        List<List<Integer>> outputList = new ArrayList<>();                                 //output list

        for(int i=0; i<nums.length-1; i++){                                                 //iterating through sorted array

            int left = i+1;                                                                 //left pointer
            int right = nums.length - 1;                                                    //right pointer

            if(i>0 && nums[i] ==nums[i-1]){                                                 //check if element is previous element
                continue;                                                                   //if yes then increment i
            }

            while(left<right){                                                              //check if left pointer is smaller then the right pointer

                int sum = nums[left]+ nums[right] + nums[i];                                //take summation of 3 pointers

                if(sum == 0){                                                               //if sum == 0 means this is the pair we wanter
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);   //make a list of 3 pointers
                    Collections.sort(list);                                                 //sort this list to maintain insertion order
                    outputList.add(list);                                                   //add this list to output list
                    left++;                                                                 //increment the left pointer
                    right--;                                                                //increment the right pointer

                    while(left<right && nums[left] == nums[left-1]){                        //check if new left pointer is same as the previous one to avoid adding duplicate elements into output list
                        left++;                                                             //if so, then increment the left pointer
                    }

                    while(left<right && nums[right] == nums[right+1]){                      //check if new right pointer is same as the previous one to avoid adding duplicate elements into output list
                        right--;                                                            //if so then decrement the right pointer
                    }
                }
                else if(sum<0){                                                             //check if 3 pointer sum is less then zero means that we need to go in right side(increment side because sorted array)
                    left++;
                    // while(left<nums.length && nums[left]==nums[left-1]){
                    //     left++;
                    // }
                }
                else{                                                                       //3 pointer sum is greater zero means that we need to go in left side (decrement side because sorted array)
                    right--;
                    // while(right>=0 && nums[right]==nums[right+1]){
                    //     right--;
                    // }
                }

            }
        }
        return outputList;

    }


//     public List<List<Integer>> threeSum(int[] nums) {

//         Arrays.sort(nums);
//         List<List<Integer>> outputList = new ArrayList<>();
//         //HashSet<List<Integer>> set = new HashSet<>();

//         for(int i=0; i<nums.length-1; i++){
//             int left = i+1;
//             int right = nums.length - 1;

//             if(i>0 && nums[i] ==nums[i-1]){
//                 continue;
//             }

//             while(left<right){

//                 int sum = nums[left]+ nums[right] + nums[i];

//                 if(sum == 0){
//                     List<Integer> list = new ArrayList<>();
//                     list.add(nums[i]);
//                     list.add(nums[left]);
//                     list.add(nums[right]);

//                     Collections.sort(list);

//                     // if(!set.contains(list)){
//                     //     outputList.add(list);
//                     // }
//                     outputList.add(list);
//                 }

//                 if(sum<0){
//                     left++;
//                     while(left<right && nums[left]==nums[left-1]){
//                         left++;
//                     }
//                 }
//                 else{
//                     right--;
//                     while(right>left && nums[right]==nums[right+1]){
//                         right--;
//                     }
//                 }

//             }
//         }
//         return outputList;

//     }

}


