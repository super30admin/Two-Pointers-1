// Time Complexity : 
/* For Brute force O(n^3) -- nested iterations - n times n^2 iterartions
For 2 pointer approach -- Sorting + N times 2sum(i.e. 2 sum for every array element) - O(nlogn) + O(n*n) -- O(n^2) overall
HashSet Approach -- n times 2 sum - O(n^2)

Note-- making an internal hashset for checking duplicacy may increase time complexity as it everytime requires to sort the internal triplet list

*/

// Space Complexity :
/*  
 * O(1) - Brute force
 * O(n) - HashSet
 * O(1) - two pointer approach
*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to refer the class discussion and also faced issue while handling the left and right pointers


// Your code here along with comments explaining your approach

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* HashSet solution */
        // List<List<Integer>> myList = new ArrayList<>();
        // HashSet<List<Integer>> checkSet = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     int target = -1*nums[i];
        //     HashSet mySet = new HashSet<>();
            
        //     for(int j=i+1;j<nums.length;j++){
        //         if(mySet.contains(target-nums[j])){
        //             List<Integer> list = Arrays.asList(nums[i],nums[j],target-nums[j]);
        //             Collections.sort(list);
        //             if(!checkSet.contains(list)){
        //                 checkSet.add(list);
        //                 myList.add(list);
        //             }
        //         }else{
        //             mySet.add(nums[j]);
        //         }
        //     }
        // }

        // return myList;

        /* 2 pointer soution */
        // Use HashSet to remove Duplicacy
        /* List<List<Integer>> myList = new ArrayList<>();
        HashSet<List<Integer>> checkSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left = i+1; int right = nums.length - 1;
            int target = -1*nums[i];
            while(left<right){
                if(nums[left]+nums[right]>target){
                    right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else if(nums[left]+nums[right]==target){
                    List<Integer> list = Arrays.asList(nums[left],nums[right],nums[i]);
                    Collections.sort(list);
                    if(!checkSet.contains(list)){
                        checkSet.add(list);
                        myList.add(list);
                    }
                    left++;right--;
                }
            }
        }

        return myList; */

        // Used different while loop approach to remove duplicacy
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left = i+1; int right = nums.length - 1;
            int target = -1*nums[i];
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                if(nums[left]+nums[right]>target){
                    right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else if(nums[left]+nums[right]==target){
                    List<Integer> list = Arrays.asList(nums[left],nums[right],nums[i]);
                    left++;right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                    myList.add(list);
                    
                }
            }
        }

        return myList;
    }
}