// ## Problem2 (https://leetcode.com/problems/3sum/)
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

// Approach 1: Brute force approach
// Time Complexity :O(n2)
// Space Complexity :O(n) //we will need a set to store unique pairs
// Did this code successfully run on Leetcode : Yes (Time limit exceed)
// Any problem you faced while coding this : No

//In this approach we will go brute force and and use 3 loops. Once we get a pair we will sort that pair and insert it in a hashset
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Base condition
        if(nums==null || nums.length==0){
            return;
        }
        //List and Hashset Initialization
        List<List<Integer>> sum = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        //three loops to iterate over the given array
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    //If nums[i]+nums[j]+nums[k]==0 then we will create a list, sort it and then insert it in a set. 
                    //As set does not contains duplicates still we have to check if it contains or not else it will insert a duplicate in this case
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> l=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(l);
                        if(!set.contains(l)){
                            set.add(l);
                            sum.add(l);
                        }
                        
                    }
                }
            }
        }
        //Return List of List sum
        return sum;
    }
}

//Approach 2:
// Time Complexity :O(n2)
// Space Complexity :O(1) //we will need a set to store unique pairs
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach
// In this approach we have sorted the array and then we are traversing using an for loop and two indexes left and right
// So in total there will be 3 pointers i, left and right
// we will add values at all 3 indexes and see if sum is 0, >0 or <0
// if 0 we will create a list and add it in a list
// if >0 we will decrement the right pointer as the array is sorted and we want the sum as 0
// if <0 we will increment the left pointer
// Also if i is -2 left before was 1 and right 1 then the sum will be -1 and after incrementing left we again got 1 so it will be same again so for every pointer we will be increasing until the current and previous are not equal
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Base Condition check
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        //Sorted the array
        Arrays.sort(nums);
        int n=nums.length;
        //We will traverse the sorted array
        for(int i=0;i<n;i++){
            //if nums[i] is 0 and we know nums[left] or nums[right] are greater so then we will not move further
            if(nums[i]>0){
                break;
            }
            //We are checking if current of i and previous are equal or not
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] > 0){
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
                else{
                    List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]));
                    list.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                }
            }
            
        }
        //returning list
        return list;
    }
}