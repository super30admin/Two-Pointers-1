package prog_15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
    we have given an array, and we have to find all the combinations or set of 3 numbers whose sum is 0

    [2,3,-1,0,0,1,2,-3,4,1,1,0,0,-1,2]
    we have to find [3,0,-3], [2,1,-3], [-3,0, 0].........
    We also need to take care of repetition. We should not have same set of values multiple times
    for eg. for value -1, set will be[-1,0,1] , [-1,1,0]... we should be having only 1 set.

    1) Brute Force Approach 1 [Nested Iteration]:
    In this we solution, we can perform nested iterations.
    We will start with value 2 => target(0) - 2  = -2 => from value 3 to 2 find possible pair whose sum is -2
    Then we will do for value 3 again 2 nested iteration, then for value -1 again 2 nested iterations
    Time complexity : O(N) * O(N^2) = O(N^3) ==> O(N) for outer loop and for every value we are performing 2 nested
    iterations.
    Space Complexity: O(1)

    2) Brute Force Approach 2 [Hashing based]:
    Lets check solution for 2 sum first for hashing technique. Suppose at index i for value 2 -> 0-2 = -2
    We have to find from sum -2 from index i+1, we will start with value 3, if value is not -2  then add
    into hashset, if value is there then note down that pair and move to next number
    [2,3,-1,0,0,1,2,-3,4,1,1,0,0,-1,2]
    We can perform the same, with the 3 sum pattern
    Here, we can start from value 2 so => target - 2 => 0 - 2 => -2, and from array 3 to 2 we can find a pair with
    sum -2 using 2 sum hashing technique.
    Time complexity: O(N) for outer loop and for every N elements O(N) for inner 2 sum hashing loop. => O(N) * O(N)
    => O(N) * O(N) => O(N^2)
    Space complexity : O(N) => as we are maintaing a hashset, for storing the result.

    3) Approach 3: [Binary Search]
    Time Complexity : O(NlogN) for sorting and O(N) * O(NlogN) => for pivot loop its O(N) and finding 2 pairs using
    binary search its NlogN
    So N*NlogN => N^2 Log N

    4) Approach 4 : [Two pointer approach]
    First we will sort the array.
    [-3,-2,-1,-1,-1,0,0,0,0,0,1,1,1,1,2,2,2,2,3,3,4]
    For this solution,
    i) we will start with fixed index at -3 , then we will put left pointer at -2 and right at 4
    0 - (-3) => 3, now we have to find the pair from -2 to 4 whose sum is 3.
    now -2 + 4 = 2 => we will move left pointer to -1, now -1+4 => 3 we found pair [-3,-1,4]
    we will move both the pointer left++ and right--
    now our next value of left is same, also we have to avoid repetition, for that we will be moving left pointer
    untill it's value not the same and right pointer untill its value is not same.
    ii)Now suppose fixed index at value -1 we found all the possible pairs, our next pivot is also -1. We will get same
    repititions. To handle that, we will move our pivot as well until next value is not same as current.
    Time Complexity : O(NlogN) for sorting and O(N) * O(N) => for pivot loop its O(N) and finding 2 pairs from left tp
    right its O(N).
    so O(N^2)
    Space : O(1)

     */
public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sorting the array
        for(int i=0; i<nums.length;i++){
        if(nums[i]>0){ // If our fixed index value/ pivot is positive then we will not get
        break ; // any pair with sum 0, thats why if value is more than 0 then break.
        }
        if(i > 0 && nums[i] == nums[i-1]) // To avoid outside duplicacy
        {
        continue ;
        }
        int left = i+1 ;
        int right = nums.length-1 ;

        while(left<right){
        int sum = nums[i] + nums[right] + nums[left]  ;

        if(sum == 0){
        List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
        result.add(li);
        left ++ ;
        right -- ;
        while(left<right && nums[left] ==nums[left-1]){ // to avoid inside duplicacy of left pointer. As we
        //are changing the variable value of base condition
        left ++ ; // we need to check base condition here as well.
        }
        while(left<right && right!=nums.length -1 && nums[right]==nums[right+1]){// to avoid inside
        //duplicacy of right pointer. As we are changing the variable value of base condition, we need to
        //check base condition here as well.
        right -- ;
        }


        }
        else if(sum>0){ //if sum greater than 0 that means we should move our right pointer to lesser value;
        right -- ;
        }
        else{   //if sum less than 0 that means we should move our left pointer to greter value;
        left ++ ;
        }

        }
        }

        return result ;
        }
        }